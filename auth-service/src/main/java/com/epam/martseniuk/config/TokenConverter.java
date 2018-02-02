package com.epam.martseniuk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;
import org.springframework.security.web.AuthenticationEntryPoint;

import java.security.KeyPair;

/**
 * @author Roman_Martseniuk
 */
@Configuration
public class TokenConverter {

    @Bean("jwtTokenConverter")
    public AccessTokenConverter getTokenConverter() {
        KeyPair keyPair = new KeyStoreKeyFactory(new ClassPathResource("keystore.jks"), "password".toCharArray()).getKeyPair("test");
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setKeyPair(keyPair);
        return converter;
    }

}
