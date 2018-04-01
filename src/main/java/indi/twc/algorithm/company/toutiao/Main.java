package indi.twc.algorithm.company.toutiao;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number1 = new ArrayList<>();
        while (sc.hasNext()) {
            sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(average(s1, s2));
        }
    }

    private static int average(String s1, String s2) {
        String[] strings = s1.split(" ");
        int[] numbers1 = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers1[i] = Integer.valueOf(strings[i]);
        }
        Arrays.sort(numbers1);
        ArrayList<Integer> number1 = new ArrayList<>();
        for (int i : numbers1) {
            number1.add(i);
        }

        strings = s2.split(" ");
        int[] numbers2 = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers2[i] = Integer.valueOf(strings[i]);
        }
        Arrays.sort(numbers2);
        ArrayList<Integer> number2 = new ArrayList<>();
        for (int i : numbers2) {
            number2.add(i);
        }

        double num1 = getAverage(number1);
        double num2 = getAverage(number2);

        double small = num1 < num2 ? num1 : num2;
        double big = num1 < num2 ? num2 : num1;

        ArrayList<Integer> bignumbers = num1 < num2 ? number2 : number1;
        ArrayList<Integer> smallnumbers = num1 < num2 ? number1 : number2;
        int num;
        int count = 0;
        for (int i = 0; i < bignumbers.size(); i++) {
            num = bignumbers.get(i);
            if (num <= big && small <= num) {
                smallnumbers.add(num);
                bignumbers.remove(i);
                i--;
                count++;
                small = getAverage(smallnumbers);
                big = getAverage(bignumbers);
            }
        }
        return count;
    }

    private static double getAverage(ArrayList<Integer> numbers) {
        double sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum / numbers.size();
    }
}
