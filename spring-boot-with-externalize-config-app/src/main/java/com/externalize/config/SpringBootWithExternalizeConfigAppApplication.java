package com.externalize.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootWithExternalizeConfigAppApplication implements CommandLineRunner{

	@Autowired
	private AppConfig appConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithExternalizeConfigAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("App Config :: {}", appConfig.toString());
	}

}
