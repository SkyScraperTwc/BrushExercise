package indi.twc.algorithm.offer.No31to40;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 第一个只出现一次的字符
 */
public class Main33 {
    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("aabcc"));
    }

    public int FirstNotRepeatingChar2(String str) {
        int[] cnts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            cnts[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (cnts[str.charAt(i)] == 1) return i;
        }
        return -1;
    }

    public static int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                int value = map.get(ch[i]);
                map.put(ch[i], value + 1);
            } else {
                map.put(ch[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) {
                return str.indexOf(entry.getKey());
            }
        }
        return 0;
    }
}
