package com.intergration.paymentcenter.unionpaypayment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.intergration.paymentcenter.unionpaypayment.dao")
@SpringBootApplication
public class UnionpayPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnionpayPaymentApplication.class, args);
	}

}
