package com.Springboot_by_teleusko.First;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {

		ApplicationContext c  = SpringApplication.run(FirstApplication.class, args);

		Dev co = c.getBean(Dev.class);
		co.build();

	}

}
