class Person{
    private String FirstName="Amol";
    private String LastName="Palwe";

    void getFirstName(){
        System.out.println(this.FirstName);
    }

    void getLastName(){
        System.out.println(this.LastName);
    }

}

class Employee extends Person{
    String EmployeeID="PRN1211";
    String jobTitle="SDE";
    void getEmployeeID(){
        System.out.println(this.EmployeeID);
    }

    void getLastName(){
        System.out.print(jobTitle+" ");
        super.getLastName();
    }
}

public class Q22 {
    public static void main(String[] args) {

        Person obj = new Employee();
        obj.getFirstName();
        obj.getLastName();
        
    }
    
}
