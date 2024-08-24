import java.io.*;
import java.util.Scanner;

class SumofDigits2
{
    int digitsSum(int n)
    {
        int temp,r,sum=0;
        temp=n;
        while(n>0 || sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        SumofDigits2 sd = new SumofDigits2();
        int n;
        System.out.print("Enter an integer to find the sum of its digits : ");
        n=sc.nextInt();
        System.out.println("Sum of the digits of "+n+" is "+sd.digitsSum(n));
    }
}
