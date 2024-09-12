import java.io.*;
import java.util.Scanner;   
public class Diagnoldemo {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the matrix:");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int arr[][] = new int[r][c];
    int sum = 0;
    System.out.println("Enter " + (r*c) + " elements into the matrix:");
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            arr[i][j] = sc.nextInt();
        }
    }
       // Displaying the matrix
       System.out.println("The matrix is:");
       for (int i = 0; i < r; i++) {
           for (int j = 0; j <c ; j++) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
    //Summation of diagnol elements
      for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            if(i == j){
                sum = sum+arr[i][j];
            }
  }  
}
    System.out.println("Sum of principle daignol elements is:" +sum);
    sc.close();
}
}
