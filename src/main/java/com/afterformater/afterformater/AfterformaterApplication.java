package com.afterformater.afterformater;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AfterformaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfterformaterApplication.class, args);


		System.out.println("Main Started!!!");
	}

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}

}
