package com.javax0.classinit;

import static com.javax0.classinit.Printer.println;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        println("creating concrete object");
        try {
            Concrete c = new Concrete();
        }catch(Throwable ignore){

        }
        println("concrete object done");
        Thread.sleep(1000);
        Concrete c = new Concrete();
    }
}
