package org.gxstar.corspring.web;

import org.gxstar.corspring.config.CORSbApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CORSbApplicationConfig.class)
public class ChainOfResponsibilitySbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChainOfResponsibilitySbApplication.class, args);
	}

}
