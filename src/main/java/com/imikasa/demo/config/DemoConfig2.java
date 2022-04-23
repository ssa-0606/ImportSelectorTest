package com.imikasa.demo.config;


import com.imikasa.demo.beans.DemoD;
import com.imikasa.demo.beans.DemoE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mikasa
 */
public class DemoConfig2 {

    @Bean
    public DemoD demoD(){
        return new DemoD();
    }

    @Bean
    public DemoE demoE(){
        return new DemoE();
    }

}
