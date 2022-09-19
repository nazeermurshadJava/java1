package exceptionhandlingjava;

public class MethodHandling {
    int c;
    void add(int a,int b){
        c=a+b;
        System.out.println("add" + c);
    }
    void div(int a,int b){
        c=a/b;
        System.out.println("divi" +c);

    }
    void mul(int a,int b){
        c=a*b;
        System.out.println("mul" +c);
    }

    public static void main(String[] args) {

        MethodHandling m=new MethodHandling();
        m.add(1,20);
        try {
            m.div(10,0);
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

        m.mul(3,2);
    }
}
