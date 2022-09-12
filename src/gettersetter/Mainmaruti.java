package gettersetter;

public class Mainmaruti {
    public static void main(String[] args) {
       Baleno b=new Baleno();
       b.setName("baleno");
       b.setColor("red");
       b.setPrice(700000);
       b.setEngine("5 hp");
       b.setModelno(" baleno alpha");
       b.setGroundclear(155);

       b.display();

       Swift s=new Swift();
        s.setName("swift");
        s.setColor("black");
        s.setPrice(500000);
        s.setEngine("4 hp");
        s.setModelno("swift12");
        s.setGroundclear(133);


    }
}
