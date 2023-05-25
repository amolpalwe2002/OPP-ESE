class Arithmetic{
    int add(int a, int b){
        return a+b;
    }
}

class Adder extends Arithmetic{

}

public class Q6 {
    public static void main(String[] args) {
        Arithmetic obj = new Adder();
        System.out.println("My superclass is: " + obj.getClass().getSuperclass().getName());
        System.out.println(obj.add(10, 32)+" "+obj.add(10, 3)+" "+obj.add(10, 10));

    }
    
}
