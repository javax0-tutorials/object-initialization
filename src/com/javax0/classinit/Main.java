package com.javax0.classinit;

import static com.javax0.classinit.Printer.println;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        println("creating concrete object");
        Concrete c = new Concrete();
        println("1st concrete object done");
        c = new Concrete();
        println("2nd concrete object done");
    }
}
