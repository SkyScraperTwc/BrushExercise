package indi.twc.algorithm.company.cvte;

public class B extends A {

    protected void foo (Integer a) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A a = new B();
        a.foo(new Integer(1));
    }

}

class A {
    public void foo(Object a) {
        System.out.println("A");
    }
}
