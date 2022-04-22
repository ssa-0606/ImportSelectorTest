package com.imikasa;

import com.imikasa.config.PrintSelector;
import com.imikasa.sources.MyPrint;
import com.imikasa.sources.impl.DbPrint;
import com.imikasa.sources.impl.FilePrint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mikasa
 */

//@PrintSelector
//@PrintSelector(FilePrint.class)
@PrintSelector(DbPrint.class)
@SpringBootApplication
public class Application {

    public Application(MyPrint myPrint) {
        myPrint.print();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
