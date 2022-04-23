package com.imikasa.demo.config;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Mikasa
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(DemoConfigurationSelector.class)
public @interface DemoSelector {
    String value() default "all";
}
