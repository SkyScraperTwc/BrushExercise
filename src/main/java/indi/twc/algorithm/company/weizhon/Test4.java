package indi.twc.algorithm.company.weizhon;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class Test4 implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Test4());
        thread.start();
        System.out.println("begin ");
        thread.join();
        System.out.println("end ");

        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        String info = runtimeMXBean.getName();
        int index = info.indexOf("@");
        if (index != -1){
            int pid = Integer.parseInt(info.substring(0, index));
            System.out.println(info);
            System.out.println(pid);
        }

        while (true) {

        }
    }

    public void run(){
        for (int i = 0;i<3;i++){
            System.out.println(i+" ");
        }
    }
}
