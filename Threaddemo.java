import java.io.*;
public class Threaddemo extends Thread{
    public static void main(String args[]){
        Thread t1 = new Thread("My thread");
        Threaddemo t2 = new Threaddemo();
        t1.start();
        t2.start();
        String str = t1.getName();
        System.out.println("The name of thread1 is"+str);
    }
public void run(){
    System.out.println("Thread is created & is executing");
}
}
