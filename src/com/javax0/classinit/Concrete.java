package com.javax0.classinit;

import static com.javax0.classinit.Printer.println;

public class Concrete {
    static Concrete me = new Concrete();

    static {
        println("static block before constructor");
    }


    {
        println("block before constructor");
    }

    public Concrete() {
        println("constructor");
    }

    static {
        println("static block after constructor");
    }

    {
        println("block after constructor");
    }

}
