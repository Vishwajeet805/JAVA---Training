package MultiThreading;
import java.util.*;
class Mythread1 extends Thread {
    public void run() {
        System.out.println("hello");
        for (int i = 0; i <=10; i++) {
            System.out.println("Video Downloading "+i+"0%");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class Time {
    static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    Mythread1 t1 = new Mythread1();
    t1.start();
        for (int i = 0; i <=10; i++) {
            System.out.println("Completed "+i+"0%");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
