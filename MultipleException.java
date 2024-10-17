import java.io.*;

class MultipleException {
    public static void main(String args[]) {
        int a = 5, b = 0, c;
        int arr[] = new int[5];
        String str = null; // Use 'null' in lowercase
        
        try {
            c = a / b; // This will throw ArithmeticException
            arr[10] = 200; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("The length of the string is " + str.length()); // Use 'length()'
        } 
        catch (ArithmeticException ae) {
            System.out.println("ArithmeticException caught");
        }
        catch (ArrayIndexOutOfBoundsException x) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        catch (NullPointerException np) {
            System.out.println("NullPointerException caught");
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
