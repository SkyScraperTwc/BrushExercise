package indi.twc.algorithm.company.cvte;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int num = resolve("YJL12eD90Cyd");
        System.out.println(num);
    }

    public static int resolve(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String str = s.toLowerCase();
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                int value = map.get(ch[i]);
                map.put(ch[i], value + 1);
            } else {
                map.put(ch[i], 1);
            }
        }

        int num = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                num++;
            }
        }
        return num;
    }
}
