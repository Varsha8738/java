class Trycatch3{
    public static void main(String args[]){
        int b=0,a=10,c=0;
        try{
            c=a/b;
            System.out.println("Value is c is:" +c);
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException caught" +ae);
        }
        catch(Exception e){
            System.out.println("Exception caught" +e);
        }
        
    }
}
