package tqtestexception;

public class TryFinallyReturnValue {
    public int method(){
        int div=0;
        int a=10,b=2;
        try {
            div=a+b;
        }catch (ArithmeticException e){
            return 2;
        }finally {
            return 3;
        }

    }

    public static void main(String[] args) {
        TryFinallyReturnValue t=new TryFinallyReturnValue();
        System.out.println(t.method());
    }
}
