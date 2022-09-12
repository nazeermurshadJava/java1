package iheritance;

public class MainCar {
    public static void main(String[] args) {
        Driver d1=new Driver("raj","1234567");
        Driver d2=new Driver("sanket","55677888");

        Car c1=new Car(111,"swift","mh0405",d1);
        Car c2=new Car(122,"pajero","mh45",d2);
        System.out.println(c1);
        System.out.println();
        System.out.println(c2);

    }
}
