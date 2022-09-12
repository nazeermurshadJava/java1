package abstractMethod;

public class Swift extends Car{
    @Override
    void engine() {

    System.out.println("swift engine 455 cc");
    }

    @Override
    void dashBoard() {
        System.out.println("airbag");
    }

    @Override
    void features() {
        System.out.println("petrol indicator");
    }
}
