package com.imikasa.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Mikasa
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(PrintConfigSelector.class)
public @interface PrintSelector {
    Class<?> value() default PrintConfigSelector.ConsoleConfiguration.class;
}
