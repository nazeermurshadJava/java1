package accessmodifay;

public class Test1 {
    private int a=10;
    int b=20;
    protected int c=30;
    public int d=40;

    public static void main(String[] args) {
        Test1 t1=new Test1();
        System.out.println(t1.a);
        System.out.println(t1.b);
        System.out.println(t1.c);
        System.out.println(t1.d);
    }

}
