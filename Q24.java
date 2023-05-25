class checkAge extends Exception{
    
    checkAge(String str){
        super(str);
    }
}

class checkName extends Exception{
    
    checkName(String str){
        super(str);
    }
}

class Student{
    int rollNo;
    String Name;
    int age;
    String course;

    Student(int rollNo, String Name,int age, String course) throws Exception{
        int flag =0;
        if(age<15 || age>=21){
            throw new checkAge("AgeNotWithinRangeException");
        }else this.age = age;
        
        for(int i =0 ; i<Name.length(); i++){
            char ch;
            ch=Name.charAt(i);
            if(ch<'A' || ch>'Z' && ch<'a' || ch>'z') flag =1;
        }
        if(flag ==1){
            throw new checkName("NameNotValidException");
        }else this.Name = Name;
        
        this.rollNo = rollNo;
        this.course = course;
    }
}
public class Q24 {
    public static void main(String[] args) {

        try {
            Student obj = new Student(43, "AmolPalwe",20, "OOPs");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
