package com.imikasa.demo.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Mikasa
 */
public class DemoConfigurationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(annotationMetadata.getAnnotationAttributes(DemoSelector.class.getName()));
        String config = annotationAttributes.getString("value");
        if("config1".equalsIgnoreCase(config)){
            return new String[]{DemoConfig1.class.getName()};
        }else if("config2".equalsIgnoreCase(config)){
            return new String[]{DemoConfig2.class.getName()};
        }else{
            return new String[]{DemoConfig2.class.getName(),DemoConfig1.class.getName()};
        }

    }
}
