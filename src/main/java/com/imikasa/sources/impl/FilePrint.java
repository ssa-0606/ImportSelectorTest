package com.imikasa.sources.impl;

import com.imikasa.sources.MyPrint;

/**
 * @author Mikasa
 */
public class FilePrint implements MyPrint {
    @Override
    public void print() {
        System.out.println("file print !!!");
    }
}
