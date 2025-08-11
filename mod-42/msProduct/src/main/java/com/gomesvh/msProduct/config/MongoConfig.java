package com.gomesvh.msProduct.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.gomesvh.msProduct.repository")
public class MongoConfig {
}