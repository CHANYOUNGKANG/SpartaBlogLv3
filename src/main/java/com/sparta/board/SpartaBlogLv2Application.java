package com.sparta.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpartaBlogLv2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpartaBlogLv2Application.class, args);
	}

}
