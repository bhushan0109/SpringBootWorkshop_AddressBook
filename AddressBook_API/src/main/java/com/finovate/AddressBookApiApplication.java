package com.finovate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //  Enabling JPA Auditing
public class AddressBookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressBookApiApplication.class, args);
	}

}
