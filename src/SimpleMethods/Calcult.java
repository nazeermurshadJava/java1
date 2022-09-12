package SimpleMethods;

public class Calcult {
    int a = 50, b = 20;

    void add() {
        int a = 50, b = 20;

        System.out.println("addition is :" + (a + b));


    }

    void sub() {
        int a = 60, b = 30;
        System.out.println("substraction is :" + (a - b));
    }

    void mul() {
        int a = 60, b = 3;
        System.out.println("multiplication is :" + (a * b));
    }

    void divi() {
        int a = 100, b = 5;
        System.out.println("division is :" + (a / b));
    }

    void power() {
        int a = 5;
        System.out.println("power is :" + (a*a*a));
    }

    public static void main(String[] args) {
        Calcult c1=new Calcult();
        c1.add();
        c1.sub();
        c1.mul();
        c1.divi();
        c1.power();

    }
}
