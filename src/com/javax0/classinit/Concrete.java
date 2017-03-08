package com.javax0.classinit;

import static com.javax0.classinit.Printer.println;

public class Concrete extends Abstract {

    static {
        println("static block before Concrete constructor");
    }

    {
        println("block before Concrete constructor");
    }

    public Concrete() {
        println("Concrete constructor");
    }

    static {
        println("static block after Concrete constructor");
    }

    {
        println("block after Concrete constructor");
    }

}
