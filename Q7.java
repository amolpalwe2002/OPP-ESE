class MyCalculator{

    public long power(int n, int p) throws Exception{
        if(n == 0 && p == 0)
            throw new Exception("n and p should not be zero.");
        else if(n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");
        else
            return (long)(Math.pow(n,p));
    }
}
public class Q7{
    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();
        try{
            System.out.println(obj.power(0, 0));
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}