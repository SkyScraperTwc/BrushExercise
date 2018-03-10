package indi.twc.algorithm.company.cvte;

public class Test2 {
    public static void main(String[] args) {
        Generic<Integer> genericInteger = new Generic<Integer>();
        genericInteger.value = 1;

        Generic<String> genericString = new Generic<String>();
        genericString.value = 2;

        System.out.println(genericInteger.value);

    }
}

class Generic<T> {
    public static int value = 0;
}
