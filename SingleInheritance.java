class Employee {
    private float salary = 500; 
    public float getSalary() {
        return salary; 
    }
}

class Programmer extends Employee {
    int bonus;

    void display() {
        System.out.println("Salary of the employee is: " + (getSalary() + bonus));
    }

    
}
public class SingleInheritance{
    public static void main(String args[]) {
        Employee e = new Employee();
        Programmer p = new Programmer();
        p.bonus = 100;
        System.out.println("Salary of the employee is: " + e.getSalary());
        System.out.println("Bonus for the programmer is: " + p.bonus);
            p.display();
    }
}        
    
