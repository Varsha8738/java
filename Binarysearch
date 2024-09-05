import java.io.*;
import java.util.*;

public class Binarysearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values into the array in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search element:");
        int key = sc.nextInt();
        int low = 0, high = n - 1;
        int pos = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                pos = mid + 1;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (pos == -1) {
            System.out.println("Search unsuccessful");
            System.out.println(key + " not found");
        } else {
            System.out.println("Search successful, element found at position " + pos + " in the array");
        }
    }
}
