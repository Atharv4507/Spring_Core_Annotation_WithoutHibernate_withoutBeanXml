package com.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// import com.model.Student; don't need now.

@Configuration
@ComponentScan(basePackages = {"com.dao"})
public class MyConfig {
    public MyConfig(){
        System.out.println("we are in const");
    }
    @Bean
    @Scope
    public JdbcTemplate j1(){
        JdbcTemplate jt = new JdbcTemplate();
        jt.setDataSource(d1());
        return jt;
    }
    private DriverManagerDataSource d1(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/jap67");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    // @Bean
    // @Scope(scopeName = "prototype") // by default it is singleton
    // public Student m1(){
    //     Student s1 = new Student();
    //     s1.setSid(2);
    //     s1.setSname("Manu");
    //     s1.setScity("malegaon");
    //     s1.setSpercentage(78.09);
    //     return s1;
    // }


}
