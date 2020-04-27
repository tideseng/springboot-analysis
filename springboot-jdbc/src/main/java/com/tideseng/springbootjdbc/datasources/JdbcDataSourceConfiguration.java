package com.tideseng.springbootjdbc.datasources;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcDataSourceConfiguration {

    /**
     * 需要指定一个为首要的，否则报NoUniqueBeanDefinitionException异常：expected single matching bean but found 3
     * 或者在@SpringBootApplication注解中排除DataSourceAutoConfiguration、DataSourceTransactionManagerAutoConfiguration
     */
    @Primary
    @Bean
    @ConfigurationProperties(prefix = "app.datasource.db1")
    public DataSourceProperties db1DataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "app.datasource.db2")
    public DataSourceProperties db2DataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    public DataSource db1DataSource(){
        return db1DataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean
    public DataSource db2DataSource(){
        return db2DataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean
    public JdbcTemplate db1JdbcTemplate(){
        return new JdbcTemplate(db1DataSource());
    }

    @Bean
    public JdbcTemplate db2JdbcTemplate(){
        return new JdbcTemplate(db2DataSource());
    }

}
