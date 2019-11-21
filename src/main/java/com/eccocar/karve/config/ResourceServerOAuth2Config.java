package com.eccocar.karve.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

import java.util.Map;

@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerOAuth2Config extends GlobalMethodSecurityConfiguration {
	
	private String heimdallUrl = "http://heimdall/oauth/check_token";
	private String clientId = "karve";
	private String clientSecret = "k6_5STZYxf9s";
	
	@Bean
	public AccessTokenConverter accessTokenConverter() {
		return new CustomAccessTokenConverter();
	}
	
	@Primary
	@Bean
	public RemoteTokenServices tokenService() {
		
		RemoteTokenServices tokenService = new RemoteTokenServices();
		tokenService.setCheckTokenEndpointUrl(heimdallUrl);
		tokenService.setClientId(clientId);
		tokenService.setAccessTokenConverter(accessTokenConverter());
		tokenService.setClientSecret(clientSecret);

		return tokenService;
	}
	
	@Override
	protected MethodSecurityExpressionHandler createExpressionHandler() {
		return new OAuth2MethodSecurityExpressionHandler();
	}
	
	class CustomAccessTokenConverter extends DefaultAccessTokenConverter {

		@Override
		public OAuth2Authentication extractAuthentication(Map<String, ?> claims) {
			OAuth2Authentication authentication = super.extractAuthentication(claims);
			authentication.setDetails(claims);
			return authentication;
		}
	}
}
