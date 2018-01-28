package indi.twc.algorithm.other;

public class WaitNotifyTest {

    // 在多线程间共享的对象上使用wait
    public static final String[] shareObj = { "true" };

    public static void main(String[] args) {
        WaitNotifyTest test = new WaitNotifyTest();
        ThreadWait threadWait1 = new ThreadWait("wait thread1");
        threadWait1.setPriority(2);
        ThreadWait threadWait2 = new ThreadWait("wait thread2");
        threadWait2.setPriority(3);
        ThreadWait threadWait3 = new ThreadWait("wait thread3");
        threadWait3.setPriority(4);

        ThreadNotify threadNotify = new ThreadNotify("notify thread");

        threadNotify.start();
        threadWait1.start();
        threadWait2.start();
        threadWait3.start();
    }

}

class ThreadWait extends Thread {

    public ThreadWait(String name){
        super(name);
    }

    public void run() {
        synchronized (WaitNotifyTest.shareObj) {
            while ("true".equals(WaitNotifyTest.shareObj[0])) {
                System.out.println("线程"+ this.getName() + "开始等待");
                long startTime = System.currentTimeMillis();
                try {
                    WaitNotifyTest.shareObj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("线程" + this.getName()
                        + "等待时间为：" + (endTime - startTime));
            }
        }
        System.out.println("线程" + getName() + "等待结束");
    }
}

class ThreadNotify extends Thread {

    public ThreadNotify(String name){
        super(name);
    }

    public void run() {
        try {
            // 给等待线程等待时间
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (WaitNotifyTest.shareObj) {
            System.out.println("线程" + this.getName() + "开始准备通知");
            WaitNotifyTest.shareObj[0] = "false";
            //唤醒wait线程
            WaitNotifyTest.shareObj.notifyAll();
            System.out.println("线程" + this.getName() + "通知结束");
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程" + this.getName() + "运行结束");
    }
}