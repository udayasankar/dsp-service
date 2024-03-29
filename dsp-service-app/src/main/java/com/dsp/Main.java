package com.dsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.miq.dsp"})
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
@EntityScan(basePackages = {"com.miq.dsp.persistence.sql"})
@EnableJpaRepositories(basePackages={"com.miq.dsp.persistence.sql"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}