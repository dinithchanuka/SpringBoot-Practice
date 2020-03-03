package com.example.test.config;


import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DataSourceConfig {

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties defaultDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean("ds")
    public HikariDataSource omqaDatasource(DataSourceProperties properties){

        return properties.initializeDataSourceBuilder().type(HikariDataSource.class).build();

    }

    @Bean
    @Primary
    public JdbcTemplate o2aqJdbcTemplate(@Qualifier("ds") HikariDataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
