package com.sixessense.admin.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.sixessense.admin")
@EnableJpaRepositories(basePackages = "com.sixessense.admin")
public class JpaConfiguration {
}
