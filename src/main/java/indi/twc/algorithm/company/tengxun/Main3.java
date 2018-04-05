package indi.twc.algorithm.company.tengxun;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            //如果数组中的值全相同，直接两两组合
            if(a[0] == a[n-1]){
                int tmp = (n*(n-1))/2;
                System.out.println(tmp + " " + tmp);
                continue;
            }
            //map用来统计
            Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
            for(int i=0;i<n;i++){
                if(map.containsKey(a[i]))
                    map.put(a[i], map.get(a[i])+1);
                else
                    map.put(a[i], 1);
            }
            //求差最小个数
            int minres = 0;
            if(map.size() == n){
                int min = Math.abs(a[1]-a[0]);
                for(int i=2;i<n;i++){
                    int tmp = Math.abs(a[i]-a[i-1]);
                    if(tmp == min)
                        minres++;
                    else if(tmp < min){
                        min = tmp;
                        minres = 1;
                    }
                }
            }else{
                for(Integer key : map.keySet()){
                    int val = map.get(key);
                    if(val > 1){
                        minres += (val * (val-1))/2;
                    }
                }
            }
            //求差最大个数
            int maxres = 0;
            List<Integer> keyset = new ArrayList<Integer>(map.keySet());
            int val1 = map.get(keyset.get(0));
            int val2 = map.get(keyset.get(keyset.size()-1));
            maxres = val1 * val2;
            System.out.println(minres + " " + maxres);
        }
    }

}