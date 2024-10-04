import java.io.*;
class Point2d{
    int x = 5, y = 10;
    void display()
    {
        System.out.println("The co-ordinate are " +x+ ","+y);
    }
}
        class Point3d extends Point2d{
            int z = 15;
            void display(){
            System.out.println("The co-ordinates are "+x+y+z);
        }
        }
    public class Abstractdemo4{
    public static void main(String args[]){
        Point2d ob1 = new Point2d();
        Point3d ob2 = new Point3d();
        Point2d ob3 = new Point3d();
        ob1.display();
        ob2.display();
        ob3.display();
    }
}
