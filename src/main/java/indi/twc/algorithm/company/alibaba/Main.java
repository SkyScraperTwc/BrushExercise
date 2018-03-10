package indi.twc.algorithm.company.alibaba;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println(resolve("google"));
    }

    public static Character resolve(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        //有序的Map，底层是循环双向链表
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) != null) {
                int value = map.get(ch[i]);
                map.put(ch[i], value + 1);
            } else {
                map.put(ch[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
}
