package com.NumbertoWords.Conversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;





@SpringBootApplication
@ComponentScan(basePackages = {"com.NumbertoWords.Conversion", "com.otherpackage"})
public class NumbertowordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumbertowordsApplication.class, args);
		
		
		
		
	}
	
	

}
