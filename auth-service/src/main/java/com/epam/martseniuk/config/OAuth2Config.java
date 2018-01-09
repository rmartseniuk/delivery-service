package com.epam.martseniuk.config;

import com.epam.martseniuk.service.impl.MongoUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * @author Roman_Martseniuk
 */
@Configuration
@ConfigurationProperties
@EnableAuthorizationServer
public class OAuth2Config implements AuthorizationServerConfigurer {

    @Value("${security.oauth.client.grantTypes}")
    private String[] grantTypes;

    @Value("${security.oauth.client.clientId}")
    private String clientId;

    @Value("${security.oauth.client.secret}")
    private String secret;

    @Value("${security.oauth.client.scope}")
    private String[] scopes;

    @Value("${security.oauth.token.accessTokenValiditySeconds}")
    private int accessTokenValiditySeconds;

    @Value("${security.oauth.token.refreshTokenValiditySeconds}")
    private int refreshTokenValiditySeconds;

    @Autowired
    @Qualifier("jwtTokenConverter")
    private AccessTokenConverter accessTokenConverter;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MongoUserDetailsService userDetailsService;

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient(clientId)
                .secret(secret)
                .authorizedGrantTypes(grantTypes)
                .scopes(scopes)
                .autoApprove(true)
                .accessTokenValiditySeconds(accessTokenValiditySeconds)
                .refreshTokenValiditySeconds(refreshTokenValiditySeconds);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(tokenStore())
                .accessTokenConverter(accessTokenConverter)
                .userDetailsService(userDetailsService)
                .authenticationManager(authenticationManager);
    }

    @Bean
    TokenStore tokenStore() {
        return new JwtTokenStore((JwtAccessTokenConverter) accessTokenConverter);
    }
}
