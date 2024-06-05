package com.sufyan97.general.payment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {
	@Bean
	public PaymentService service() {
		return new PaymentServiceImpl();
	}
	
	@Bean
	public PaymentOverbook paymentOBCons() {
		return new PaymentOverbook(service());
	}
	
	@Bean
	public PaymentOverbook paymentOBSetter() {
		PaymentOverbook paymentOverbook = new PaymentOverbook();
		paymentOverbook.setPaymentService(service());
		return paymentOverbook;
	}
}
