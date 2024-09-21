package com.learning.ecommerce;

import com.learning.ecommerce.customer.CustomerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(EcommerceApplication.class, args);
		CustomerController uc1 = applicationContext.getBean(CustomerController.class);
		CustomerController uc2 = applicationContext.getBean(CustomerController.class);
		CustomerController uc3 = applicationContext.getBean(CustomerController.class);

		System.out.println(uc1);
		System.out.println(uc2);
		System.out.println(uc3);
	}

}
