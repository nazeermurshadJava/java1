package interfaceImpli;

public class FunctionalExample {
    public static void main(String[] args) {
        Functional fx= ()-> System.out.println("in display of functionalex");
        fx.display();

        Addition x=(a,b)-> System.out.println("addition"+(a+b));
        x.add(100,200);
    }
}
