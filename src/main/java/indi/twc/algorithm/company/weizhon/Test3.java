package indi.twc.algorithm.company.weizhon;

public class Test3 {
    public static void main(String[] args) {
        int[] list1 = {1,2,3};
        int list2[] = {4,5,6};
        new Test3().print(list1,list2);
    }

    public void print(int[]...all){
        for (int[] list : all){
            System.out.println(list[0]+" ");
        }
    }
}
