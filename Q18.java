import java.util.Scanner;

class Person{
    String Name;
    int Age;
    Scanner sc = new Scanner(System.in);

    Person(){
        System.out.print("Enter Name: ");
        this.Name = sc.nextLine();
        System.out.print("Enter Age: ");
        this.Age= sc.nextInt();
    }
}
class Employee extends Person{
    String Designation;
    Double Salary;

    Employee(){
        super();
        System.out.print("Enter Des: ");
        this.Designation = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter Sal: ");
        this.Salary= sc.nextDouble();
    }

}

public class Q18 {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        for(int i=0; i<5; i++){
            emp[i] = new Employee();            
        }

        for(Employee e : emp){
            if(e.Salary>5000) System.out.println(e.Name);
        }
        
    }
    
}
