package com.externalize.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "app")
public class AppConfig {
	private String username;
	private String password;
	private String port;
	private String database;
	private String uri;
}
