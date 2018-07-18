package com.kodreis.mongodb.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.kodreis.mongodb.entity.Customer;
import com.kodreis.mongodb.repository.CustomerRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = CustomerRepository.class)
public class MongoDBConfig {
	
	@Bean
	public CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				
				customerRepository.save(new Customer(1,"sefa","uncu",2000));
				customerRepository.save(new Customer(2,"ercan","kar",2000));
				
			}
		};
	}

}
