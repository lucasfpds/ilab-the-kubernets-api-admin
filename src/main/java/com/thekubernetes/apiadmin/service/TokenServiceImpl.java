package com.thekubernetes.apiadmin.service;

import com.thekubernetes.apiadmin.exception.ApiRequestException;
import com.thekubernetes.apiadmin.security.Token;
import com.thekubernetes.apiadmin.security.TokenUtil;
import org.springframework.security.core.Authentication;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class TokenServiceImpl implements ITokenService {

    @Override
    public ResponseEntity<Object> ValidToken(Token token) {
        String tokenString = token.getToken();
        if (token.getToken() == null) {
            return ResponseEntity.status(400).body("{\"message\":\"Campo 'Token' precisa ser informado.\"}");
      }
      try {
        Authentication validacao = TokenUtil.validateTokenUtil(tokenString);
          return ResponseEntity.status(201).body(validacao);
      } catch (Exception e) {

          throw new ApiRequestException("Não foi possível Cadastrar admin.");
      }
    }

    

}
