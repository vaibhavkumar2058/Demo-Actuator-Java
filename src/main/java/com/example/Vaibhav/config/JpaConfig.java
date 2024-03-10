package com.example.Vaibhav.config;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import jakarta.activation.DataSource;
import jakarta.persistence.EntityManagerFactory;

@Configuration
public class JpaConfig {
	@SuppressWarnings("unused")
	@Autowired
    private EntityManagerFactory m;

    @Bean
    public LocalContainerEntityManagerFactoryBean m(EntityManagerFactoryBuilder builder, javax.sql.DataSource dataSource) {
        return ((Object) builder
                .withDataSource(dataSource))
                .packages("com.example.Vaibhav.model")  // Package containing your entities
                .persistenceUnit()
                .build();
    }
}


