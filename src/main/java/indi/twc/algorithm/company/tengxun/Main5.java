package indi.twc.algorithm.company.tengxun;

public class Main5 {

    public static String[] grayCode(int n){
        //产生2^n个格雷码
        String[] graycode=new String[(int)Math.pow(2, n)];
        if(n==1){
            graycode[0]="0";
            graycode[1]="1";
            return graycode;
        }
        String[] last=grayCode(n-1);
        for(int i=0;i<last.length;i++){
            graycode[i]="0"+last[i];
            graycode[graycode.length-1-i]="1"+last[i];
        }
        return graycode;
    }

}