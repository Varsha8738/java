import java.io.*;
import java.util.*;
class Animal{
    String Color = "white";
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    String Color = "Black";
    void printColor(){
        System.out.println("Dog color is " + Color);
        System.out.println("Animal color is " +super.Color);
    }
    void eat(){
        System.out.println("Dog is eating");
    }
    void bark(){
        System.out.println("Dog is eating");
    }
    void work(){
        super.eat();
        printColor();
        bark();
        eat();
    }
}
class Superdemo2{
    public static void main(String args[]){
        Dog d = new Dog();
        d.work();
    }
}
