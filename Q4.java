import java.util.Scanner;

abstract class Vehicles{
    abstract void move();
}

class Helicopter extends Vehicles{
    Helicopter(){
        System.out.println("Helicopter is built successfully!!");
    }
    void move(){
        System.out.println("The Helicopter Flies in Air");
    }
}
class Car extends Vehicles{
    Car(){
        System.out.println("Car is built successfully!!");
    }
    void move(){
        System.out.println("The Car Drives on Road");
    }
}
class Train extends Vehicles{
    Train(){
        System.out.println("Train is built successfully!!");
    }
    void move(){
        System.out.println("The Train Runs on Track");
    }
}

public class Q4{
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for Helicopter\nEnter 2 for Car\nEnter 3 for Train");
        System.out.print("\nEnter which vehicle you want to build: ");
        str = sc.nextLine();
        str=str.toLowerCase();
        if(str.equals("1")){
            Vehicles obj1 = new Helicopter();
            obj1.move();
        }
        else if(str.equals("3")){
            Vehicles obj2 = new Train();
            obj2.move();
        }
        else if(str.equals("2")){
            Vehicles obj3 = new Car();
            obj3.move();
        }
        else System.out.println("Invalid entry...");
    }
}
