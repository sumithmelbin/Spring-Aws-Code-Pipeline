package com.demo.aws.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsCodePipelineApplication {

	@GetMapping("/msg")
	public String msgDemo() {
		return "Application running on AWSElastic beanstalk through AWS BUILD CODE...";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsCodePipelineApplication.class, args);
	}

}
