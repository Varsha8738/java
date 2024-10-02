import java.io.*;
import java.util.*;
class AnonymousArray{
    public static void main(String args[]){
        printArray(new int[]{10,20,30,40}); //passing values
    }
    static void printArray(int arr[]){
        System.out.println("The elements of anonymous array are:");
        for(int i = 0;i < arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
