package com.imikasa.config;

import com.imikasa.sources.impl.ConsolePrint;
import com.imikasa.sources.impl.DbPrint;
import com.imikasa.sources.impl.FilePrint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Mikasa
 */
public class PrintConfigSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(annotationMetadata.getAnnotationAttributes(PrintSelector.class.getName()));
        Class config = annotationAttributes.getClass("value");
        return new String[]{config.getName()};
    }

    public static class ConsoleConfiguration{
        @Bean
        public ConsolePrint consolePrint(){
            return new ConsolePrint();
        }
    }

    public static class FileConfiguration{
        @Bean
        public FilePrint filePrint(){
            return new FilePrint();
        }
    }

    public static class DbConfiguration{
        @Bean
        public DbPrint dbPrint(){
            return new DbPrint();
        }
    }


}
