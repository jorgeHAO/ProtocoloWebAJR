package br.com.ajr.ProtocoloWebAJR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import br.com.ajr.controller.JorgeController;
import br.com.ajr.model.Orgao;

@SpringBootApplication
@EntityScan(basePackageClasses = Orgao.class)
@ComponentScan(basePackageClasses = JorgeController.class)
public class ProtocoloWebAjrApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProtocoloWebAjrApplication.class, args);
	}
}
