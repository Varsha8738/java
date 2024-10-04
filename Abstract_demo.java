import java.io.*;
import java.util.*;
abstract class Base{
    abstract void fun();
}
class Derived extends Base{
    void fun(){
        System.out.println("Derived fun is invoked");
    }
}
class Abstract_demo{
    public static void main(String args[]){
        //Base b = new Base();
        Derived d = new Derived();
        d.fun();
        Base b = new Derived();
        b.fun();
    }
}
