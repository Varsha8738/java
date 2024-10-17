class Animal{
    String Color = "white";
}
class Dog extends Animal{
    String Color = "Black";
    void printColor(){
        System.out.println("Dog color is" +Color);
        System.out.println("Animal color is"+Color);
        System.out.println("Animal Color is" +super.Color);
    }
}
class Superdemo1{
    public static void main(String args[]){
        Dog d = new Dog();
        d.printColor();
    }
}
