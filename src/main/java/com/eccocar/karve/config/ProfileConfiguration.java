package com.eccocar.karve.config;

import org.modelmapper.ModelMapper;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProfileConfiguration {

	@Configuration
	@Profile({ "development", "production", "staging" })
	@PropertySource("http://config-service.default.svc.cluster.local/orion-${spring.profiles.active}.properties")
	static class CloudConfig {
		@LoadBalanced
		@Bean
		RestTemplate restTemplate() {
			return new RestTemplate();
		}
	}

	@Configuration
	@Profile({ "default" })
	@PropertySource("classpath:karve-default.properties")
	static class CloudDefaultConfig {
		@LoadBalanced
		@Bean
		RestTemplate restTemplate() {
			return new RestTemplate();
		}
	}

	@Configuration
	@Profile({ "test" })
	@PropertySource("http://config.dev.eccocar.com/orion-${spring.profiles.active}.properties")
	static class CloudTestConfig {
		@Primary
		@Bean
		RestTemplate restTemplate() {
			return new RestTemplate();
		}
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
