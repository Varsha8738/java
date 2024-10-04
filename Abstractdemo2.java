import java.io.*;
import java.util.*;
abstract class Base{
    Base(){
        System.out.println("Base class constructor is invoked");
    }
    abstract void fun();
}
class Derived extends Base{
    Derived()
    {
        super();
        System.out.println("Derived class constructor is invoked");
    }
    void fun(){
        System.out.println("Derived fun is invoked");
    }
}
class Abstractdemo2{
    public static void main(String args[]){
        //Base b = new Base();
        Derived d = new Derived();
        d.fun();
    }
}
