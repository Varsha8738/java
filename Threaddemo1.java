import java.io.*;
public class Threaddemo1 implements Runnable{
    public void run(){
        System.out.println("THread is created and is running");
    }
    public static void main(String args[]){
        Threaddemo2 ob = new Threaddemo2();
        Thread t = new Thread(ob);
        t.start();
    }
}
