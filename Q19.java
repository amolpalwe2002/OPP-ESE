import java.util.Scanner;

interface Account{


    void set();
    void display();
}

interface Person{


    void store();
    void disp();
}

class Customer implements Account, Person{
    String Name;
    Long AccNo;
    Double balance;
    Scanner sc = new Scanner(System.in);
    public void set(){
        System.out.print("Enter Account No.: ");
        this.AccNo = sc.nextLong();
        System.out.print("Enter Name: ");
        sc.nextLine();
        this.Name = sc.nextLine();
        System.out.print("Enter Balance: ");
        this.balance = sc.nextDouble();

    }

    public void store(){
        System.out.println("Storing Info");

    }
    public void disp(){
        System.out.println("Displaying Info");

    }

    public void display(){
        System.out.println(Name+" "+ AccNo+" "+balance);
    }
}

public class Q19{
    public static void main(String[] args) {

        Customer obj = new Customer();
        obj.set();
        obj.store();
        obj.disp();
        obj.display();
        
    }
}