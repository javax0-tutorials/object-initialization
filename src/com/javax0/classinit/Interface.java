package com.javax0.classinit;

import static com.javax0.classinit.Printer.println;

public interface Interface {

    Object x = new Object() {
        {
            println("dynamic block x in interface field object initialization");
        }
    };
    Object y = new Object() {
        {
            println("dynamic block y in interface field object initialization");
        }
    };
}
