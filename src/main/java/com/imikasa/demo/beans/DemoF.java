package com.imikasa.demo.beans;

import org.springframework.stereotype.Component;

/**
 * @author Mikasa
 */
@Component
public class DemoF {
    private final String name = "I am the DemoF";

    public DemoF() {
        System.out.println(name);
    }
}
