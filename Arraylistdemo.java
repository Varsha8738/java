import java.io.*;
import java.util.*;
public class Arraylistdemo{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer>al = new ArrayList<Integer>();
    int sum = 0;
    float avg = 0;
    System.out.println("Enter elements into array list:");
    while(sc.hasNextInt()){
        al.add(sc.nextInt());
    }
    for(int i = 0;i<al.size();i++){
        sum = sum+al.get(i);
    }
    //avg = (sum)/(al.avg());
    avg = (float)sum/al.size();
    System.out.println("Sum of elements is" + sum);
    System.out.println("Average of elements is" +avg);
}
}
