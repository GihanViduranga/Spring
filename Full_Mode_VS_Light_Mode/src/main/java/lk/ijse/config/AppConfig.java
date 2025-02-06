package lk.ijse.config;

import lk.ijse.bean.SpringBean2;
import lk.ijse.bean.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {
    /*@Bean
    public SpringBean2 getSpringBean() {
        SpringBean3 springBean = getSpringBean3();//bean method ekak athule thawath bean ekaka method ekak call karanawata api kiyanne inter Bean dependency ekak kiyala
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 getSpringBean3() {
        return new SpringBean3();
    }*/
}
