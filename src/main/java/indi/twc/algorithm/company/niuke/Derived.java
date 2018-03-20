package indi.twc.algorithm.company.niuke;

import java.util.HashMap;
import java.util.Map;

public class Derived extends Base{
    public static void main(String[] args) {
        new Derived("C");
    }

    public Derived(String s) {
        super("123");
        System.out.println("D");
    }
}

class Base {
    public Base(String s) {
        System.out.println("B");
    }
}
