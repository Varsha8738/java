import java.io.*;
public class Strings{
    public static void main(String args[]){
        try{
        String s1 = "Welcome";
        String s2 = new String("Welcome");
        String s3 = "Wel";
        System.out.println("S1 and S2 are equal " + s1.equals(s2));
        System.out.println("The CharAt 4th position in S3 is " +s3.charAt(2));
        System.out.println("The Character at 4th position in  S1 is " + s1.charAt(2));
        System.out.println("The length of S1 is:" +s1.length());
        System.out.println("S1 in uppercase is " + s1.toUpperCase());
        System.out.println("The sub string from 2,5 in s is " + s1.substring(2,5));
        System.out.println("The index of Cin S2 is " + s2.indexOf('C'));
        System.out.println("After concatenating S1 & S3 is: "+s1.concat(s3));
        System.out.println("After concatenating s3 + s1: "+s3.concat(s1));
        System.out.println("S1 contains S3 " + s1.contains(s3));
        System.out.println("S3 contains S1 :" + s3.contains(s1));
        }
         catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index that is out of bounds.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
            
        }
}
