package com.imikasa.demo.config;

import com.imikasa.demo.beans.DemoB;
import com.imikasa.demo.beans.DemoC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mikasa
 */
public class DemoConfig1 {

    @Bean
    public DemoB demoB(){
        return new DemoB();
    }

    @Bean
    public DemoC demoC(){
        return new DemoC();
    }

}
