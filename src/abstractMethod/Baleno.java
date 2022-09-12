package abstractMethod;

public abstract class Baleno extends Car{
    void engine(){
        System.out.println("baleno : 1255 cc");
    }

    @Override
    void features() {
        System.out.println("power stearing");
    }

    @Override
    void dashBoard() {
        System.out.println("music system");
    }
    void auto(){
        System.out.println("aoutomatic");
    }
}
