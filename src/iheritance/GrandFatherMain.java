package iheritance;

public class GrandFatherMain {
    public static void main(String[] args) {


        ChildInfo c = new ChildInfo();
        c.setGrandData("sohail","m","murshad");
        c.setFatherData("tausif");
        c.setChildData("abrar");
        c.display();
    }
}