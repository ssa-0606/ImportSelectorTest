package com.imikasa.sources.impl;

import com.imikasa.sources.MyPrint;

/**
 * @author Mikasa
 */
public class ConsolePrint implements MyPrint {
    @Override
    public void print() {
        System.out.println("console print !!!");
    }
}
