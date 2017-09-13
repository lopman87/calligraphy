package com.shufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
@MapperScan("com.shufa.mapper")
public class ShufaApplication {
	private static final Logger logger = LoggerFactory.getLogger(ShufaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ShufaApplication.class, args);
	}
	@PostConstruct
	public void logSomething() {
		logger.debug("Sample Debug Message");
		logger.trace("Sample Trace Message");
	}
}
