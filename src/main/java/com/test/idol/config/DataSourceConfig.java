package com.test.idol.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix="spring.datasource.hikari") // properties 파일의 key 값이 아래와 같이 같은 값으로 시작할 때, 그것을 묶어서 Bean으로 등록
    public HikariConfig hikariConfig(){
        return new HikariConfig();
    }

    @Bean
    @Resource(name = "hikariConfig")
    public DataSource dataSource(HikariConfig hikariConfig){
        return new HikariDataSource(hikariConfig);
    }
}
