package indi.twc.algorithm.huawei.practiceD;
 
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 明明的随机数
 * @author Administrator
 *
 */
public class Main2 {

     public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
         TreeSet<Integer> set = new TreeSet<Integer>();
          while(scan.hasNext()) {
              int totalNum = Integer.parseInt(scan.nextLine());
                for (int i=0; i<=totalNum-1; i++){
                    set.add(Integer.valueOf(scan.nextLine()));
                }
              for (int a:set) {
                  System.out.println(a);
              }
		  }

     }
 }
               
      
   
 