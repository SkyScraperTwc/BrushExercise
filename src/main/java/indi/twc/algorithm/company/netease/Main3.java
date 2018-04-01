package indi.twc.algorithm.company.netease;

import java.util.*;

/**
 * 字符串碎片
 */
public class Main3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N ; i++) {
            String num = scan.next();
            String input = scan.nextLine();
            Permutation(input);
        }
    }

    public static void Permutation (String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        HashSet<String[]> set = new HashSet<>();
        String[] strs = str.split(" ");
        allPermutation(strs, 0, set);

        for (String[] strings : set) {
            boolean flag = judge(strings);
            if (flag == true) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    private static boolean allPermutation (String[] strs, int start, HashSet set){
        if (start == strs.length - 1) {
            set.add(strs.clone());
        } else {
            for (int i = start; i < strs.length; i++) {
                swap(strs, i, start);
                allPermutation(strs, start + 1, set);
                swap(strs, start, i);
            }
        }
        return false;
    }

    private static void swap (String[] strs, int i, int j){
        String temp = strs[i];
        strs[i] = strs[j];
        strs[j] = temp;
    }

    private static boolean judge(String[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            int a = Integer.parseInt(s[i]);
            int b = Integer.parseInt(s[i + 1]);
            if ((a * b) % 4 == 0) {
                return true;
            }
        }
        return false;
    }
}
