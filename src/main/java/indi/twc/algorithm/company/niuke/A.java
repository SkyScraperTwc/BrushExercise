package indi.twc.algorithm.company.niuke;

public class A {
    public static void main(String[] args) {
        B year = new B();
    }

    {
        System.out.println("A1");
    }

    static {
        System.out.println("A2");
    }

    A(){
        System.out.println("A3");
    }
}

class B extends A{
    {
        System.out.println("B1");
    }

    static {
        System.out.println("B2");
    }

    B(){
        System.out.println("B3");
    }
}


