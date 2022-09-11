package com.cafehub.api.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.tomcat.test-on-borrow}")
    private boolean testOnBorrow;
    @Value("${spring.tomcat.validation-query}")
    private String validationQuery;
    @Value("${spring.tomcat.connection-properties}")
    private String connectionProperties;

    @Bean
    DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setConnectionProperties(connectionProperties);
        return dataSource;
    }
}
