package indi.twc.algorithm.other;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Throwable {
        int value = -1;
        long longvalue = value & 0x00000000ffffffffL;
        System.out.print(longvalue);
    }
}

