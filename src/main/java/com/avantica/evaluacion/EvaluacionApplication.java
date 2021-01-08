package com.avantica.evaluacion;

import com.avantica.evaluacion.service.PayOrderService;
import com.avantica.evaluacion.service.impl.PayOrderServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EvaluacionApplication {

	@Bean
	PayOrderService buildPayOrderService() {
		return new PayOrderServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionApplication.class, args);
	}

}
