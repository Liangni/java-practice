package com.amigoscode;

import com.amigoscode.domain.Customer;
import com.amigoscode.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class, args);
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String beanDefinitionName: beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRespository) {
        return args -> {
            Customer alex = new Customer(1, "Alex", "alex@gmail.com", 21);
            Customer jamila = new Customer(2, "Jamila", "jamila@gmail.com", 21);
//            List<Customer> customers = List.of(alex, jamila);
            customerRespository.saveAll(List.of(alex, jamila));
        };
    }
}
