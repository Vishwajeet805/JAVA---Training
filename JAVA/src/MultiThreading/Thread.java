package MultiThreading;

import java.util.*;

class Mythread extends Thread {
    public void run() {
        System.out.println("hello");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " t");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadMain {
    static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Mythread t1 = new Mythread();
        t1.start();
        try {
            t1.join();
            for (int i = 0; i < 7; i++) {
                System.out.println(i + " t1");
            }
        } catch (Exception e) {

        }
    }
}
