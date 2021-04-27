package com.demo.cloudTask;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@SpringBootApplication
@EnableBatchProcessing
public class Test6Application {
	
	
	public static void main(String[] args) {
		SpringApplication.run(Test6Application.class, args);
	}
}
