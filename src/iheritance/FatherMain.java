package iheritance;

public class FatherMain {
    public static void main(String[] args) {
        Father f=new Father();
        f.vahical();

        f=new Daughter() ; // upcasting
        f.vahical();
    }
}
