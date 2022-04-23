package com.imikasa.demo.beans;

import org.springframework.stereotype.Component;

/**
 * @author Mikasa
 */
@Component
public class DemoA {
    private final String name = "I am the DemoA";

    public DemoA() {
        System.out.println(name);
    }
}
