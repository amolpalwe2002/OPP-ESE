abstract class Marks{
    abstract void getPercentage();

}

class A extends Marks{
    private double m1, m2, m3;

    
    A(double m1, double m2, double m3){
        this.m1=m1;    
        this.m2=m2; 
        this.m3=m3;  
    }
    void getPercentage(){
        System.out.println("Percentage: "+(m1+m2+m3)/3);
    }
}

class B extends Marks{
    private double m1, m2, m3,m4;

    
    B(double m1, double m2, double m3, double m4){
        this.m1=m1;    
        this.m2=m2; 
        this.m3=m3;  
        this.m4=m4;
    }
    void getPercentage(){
        System.out.println("Percentage: "+(m1+m2+m3+m4)/4);
    }
}

public class Q5 {
    public static void main(String[] args) {

        Marks obj1 = new A(94,95,96);
        Marks obj2 = new B(94,95,96,90);
        obj1.getPercentage();
        obj2.getPercentage();
        
    }
    
}
