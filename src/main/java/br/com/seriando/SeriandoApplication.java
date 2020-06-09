package br.com.seriando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SeriandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeriandoApplication.class, args);
	}


}

