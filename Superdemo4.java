import java.io.*;
class Point2d{
    int x,y;
    Point2d(){
        x = 0;
        y= 0;
    }
        Point2d(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    class Point3d extends Point2d{
        int z;
        Point3d(){
        super();
        z=0;
        }
        Point3d(int x,int y,int z){
            super(x,y);
            this.z = z;
        }
    }
    class Superdemo4{
        public static void main(String args[]){
        Point3d ob = new Point3d();
         System.out.println("Point3d coordinates: (" + ob.x + ", " + ob.y + ", " + ob.z + ")");
        }
    }
