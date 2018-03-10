package indi.twc.algorithm.offer.No21to30;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * 字符串的全排列
 */
public class Main26 {
    public static void main(String[] args) {
        Permutation("aabc");
    }

    public static ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) {
            return new ArrayList<>();
        }

        //保存所有的全排列
        HashSet<String> set = new HashSet<>();

        allPermutation(str.toCharArray(), set, 0);

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list);
        return list;
    }

    private static void allPermutation(char[] ch, HashSet<String> set, int start){
        if (start == ch.length - 1) {
            set.add(String.valueOf(ch));
        } else {
            for (int i = start; i < ch.length; i++) {
                swap(ch, i, start);
                allPermutation(ch, set, start + 1);
                swap(ch, start, i);
            }
        }
    }

    private static void swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

}
