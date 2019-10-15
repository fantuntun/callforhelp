package com.chf.materialBrowse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MaterialBrowseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaterialBrowseApplication.class, args);
	}

}
