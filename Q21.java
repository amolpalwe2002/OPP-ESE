import java.util.ArrayList;
import java.util.List;

class Student{
    private String Name;
    private String Grade;
    private ArrayList<String> courses;

    Student(String Name, String Grade){
        this.Name = Name;
        this.Grade = Grade;
        this.courses=new ArrayList<>();
    }

    void addCourse(String c){
        courses.add(c);
    }

    void removeCourse(String c){
        courses.remove(c);
    }

    void displayInfo(){
        System.out.println("Name: "+ this.Name+"\nGrade: "+this.Grade);
        
        System.out.println("Courses: "+courses);
    }
}

public class Q21{
    public static void main(String[] args) {
        Student obj = new Student("Amol", "A+");
        obj.addCourse("DBMS");
        obj.addCourse("Data Science");
        obj.addCourse("OOPs");
        obj.addCourse("IoT");
        obj.displayInfo();
        
    }
}