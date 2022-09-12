package abstractMethod;

public class CarMain {
    public static void main(String[] args) {
     /*  Baleno b=new Baleno();
        b.setColor("red");
        b.setPrice(700000);
        b.engine();
        b.dashBoard();
        b.features();
        System.out.println("color: " +b.getColor()+" price : "+b.getPrice());

      */

        System.out.println("============================");
        Swift s=new Swift();
        s.setColor("blue");
        s.setPrice(600000);
        s.engine();
        s.dashBoard();
        s.features();
        System.out.println("swift color" +s.getColor() +"swift price" + s.getPrice());
        System.out.println("=========================================");


         BalenoAlph b1=new BalenoAlph();
         b1.setColor("black"+ " ");
         b1.setPrice(760000);
         b1.auto();
        System.out.println(" balenoAlph" + b1.getColor()  +"balenoAlpha price " +  b1.getPrice());
    }
}
