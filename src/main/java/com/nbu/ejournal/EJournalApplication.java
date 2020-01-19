package com.nbu.ejournal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.nbu.ejournal"})
public class EJournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EJournalApplication.class, args);
	}

}
