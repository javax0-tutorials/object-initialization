package com.javax0.classinit;

import static com.javax0.classinit.Printer.println;

public abstract class Abstract implements Interface {
    static {
        println("static block before Abstract constructor");
    }

    {
        println("block before Abstract constructor");
    }

    public Abstract() {
        println("Abstract constructor");
    }

    static {
        println("static block after Abstract constructor");
    }

    {
        println("block after Abstract constructor");
    }
}
