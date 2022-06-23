![Logo](https://www.notion.so/image/https%3A%2F%2Fbutecotecnologico.com.br%2Fkubernetes-explicado%2Fk8s-logo.png?table=block&id=4bdd526d-997b-4b7a-aff3-60f6d830cb8e&spaceId=b5bde1f6-a69d-4d6a-ba92-e85e080fe677&width=150&height=150&userId=8a4a1998-bbe3-4ecd-8da4-81ad9f899b9c&cache=v2)
# The Kubernetes: API de Administrador


</br>

## Tópicos

   * [Sobre o projeto](#-sobre-o-projeto)
   * [Informações Gerais](#-informações-gerais)
   * [Endpoints da API](#-endpoints-da-api)
      * [Create Order](#-create-order)
      * [List Orders](#-list-orders)
   * [Pré-requisitos](#-pré-requisitos)
   * [Executar a aplicação](#-executar-a-aplicação)
   * [Tecnologias](#-tecnologias)
   * [Equipe responsável](#-equipe-responsável)

<br/>
<hr/>

## 📌 Sobre o projeto

<p>
O projeto tem como objetivo implementar um sistema de realização de pedidos, gerenciado por um administrador. Para o funcionamento correto da aplicação, o administrador precisa estar logado em sua conta para que o pedido seja criado. O processamento deste deve ocorrer através de um sistema de mensageria (em background), com o envio de e-mail ao usuário ao término da operação, informando que o pedido foi realizado com sucesso.
Por fim, os pedidos devem ser armazenados em um banco de dados, possibilitando que posteriormente estes possam ser consultados.


Em resumo, o fluxo do processo consiste em:

- Administrador se conecta à aplicação.
- Seleciona qual a opção desejada (usuários ou pedidos).
  - Caso usuários seja escolhido:
    - Cadastrar um novo usuário.
    - Editar um usuário existente.
    - Excluir um usuário.
  - Caso pedidos seja escolhido:
    - Criar um novo pedido.
      - O pedido é enviado para o sistema de mensageria.
      - O sistema de mensageria processa o pedido.
      - O sistema de mensageria envia um e-mail ao usuário, informado que o pedido foi realizado.
- Independente da escolha, usuários e pedidos sempre estão sendo salvos no banco de dados.  

</br>

<em>
    link para o repositório de Front: 
</em>

<br/>
<hr/>

## 📝 Informações Gerais
- A persistência dos dados foi feita no Sistema Gerenciador de Banco de Dados Postgres.
- O sistema de mensageria foi realizado utilizando Simple Queue Service (SQS) da Amazon Web Service (AWS).
- O sistema de envio de e-mails foi realizado utilizando Simple Email Service (SES) da AWS.
- As imagens docker de cada aplicação estão publicadas no [DockerHub](https://hub.docker.com/).
- As aplicações foram deployadas utilizando Kubernetes.

</br>

O que foi implementado durante o projeto:
1) endpoint cadastrar (nome, email e senha);
2) endpoint login administrador (email e senha);
3) endpoint cadastrar usuário;
4) endpoint editar usuário;
5) endpoint excluir usuário;
6) endpoint listarusuários;
7) endpoint cadastrar pedido;
8) endpoint listar pedidos;

<br/>
<hr/>

## ☞ Endpoints da API

## Name
Choose a self-explaining name for your project.

## Description
Let people know what your project can do specifically. Provide context and add a link to any reference visitors might be unfamiliar with. A list of Features or a Background subsection can also be added here. If there are alternatives to your project, this is a good place to list differentiating factors.

## Badges
On some READMEs, you may see small images that convey metadata, such as whether or not all the tests are passing for the project. You can use Shields to add some to your README. Many services also have instructions for adding a badge.

## Visuals
Depending on what you are making, it can be a good idea to include screenshots or even a video (you'll frequently see GIFs rather than actual videos). Tools like ttygif can help, but check out Asciinema for a more sophisticated method.

## Installation
Within a particular ecosystem, there may be a common way of installing things, such as using Yarn, NuGet, or Homebrew. However, consider the possibility that whoever is reading your README is a novice and would like more guidance. Listing specific steps helps remove ambiguity and gets people to using your project as quickly as possible. If it only runs in a specific context like a particular programming language version or operating system or has dependencies that have to be installed manually, also add a Requirements subsection.

## Usage
Use examples liberally, and show the expected output if you can. It's helpful to have inline the smallest example of usage that you can demonstrate, while providing links to more sophisticated examples if they are too long to reasonably include in the README.

## Support
Tell people where they can go to for help. It can be any combination of an issue tracker, a chat room, an email address, etc.

## Roadmap
If you have ideas for releases in the future, it is a good idea to list them in the README.

## Contributing
State if you are open to contributions and what your requirements are for accepting them.

For people who want to make changes to your project, it's helpful to have some documentation on how to get started. Perhaps there is a script that they should run or some environment variables that they need to set. Make these steps explicit. These instructions could also be useful to your future self.

You can also document commands to lint the code or run tests. These steps help to ensure high code quality and reduce the likelihood that the changes inadvertently break something. Having instructions for running tests is especially helpful if it requires external setup, such as starting a Selenium server for testing in a browser.

## Authors and acknowledgment
Show your appreciation to those who have contributed to the project.

## License
For open source projects, say how it is licensed.

## Project status
If you have run out of energy or time for your project, put a note at the top of the README saying that development has slowed down or stopped completely. Someone may choose to fork your project or volunteer to step in as a maintainer or owner, allowing your project to keep going. You can also make an explicit request for maintainers.
