class A {
    // Default constructor
    A() {
        System.out.println("Default constructor");
    }
}

class DefaultConstr{
    public static void main(String args[]) {
        System.out.println("Inside the main method");
        
        // Creating an object of class A
        A a = new A();
        
        System.out.println("Object created successfully");
    }
}
