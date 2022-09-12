package polye;

public class CalculatesAreas {
    void area(float a){
        System.out.println("area of square"+(a*a));

    }
    void area(double a){
        double x=3.14*a*a;
        System.out.println("area of circle is"+ x);
    }
    void area(float a,float b){
        System.out.println("area of rectangle is "+(a*b));
    }
    void area(double h,double b)
    {
        double tra=h*b/2;
        System.out.println("area of trangle"+tra);
    }

    public static void main(String[] args) {
        CalculatesAreas a=new CalculatesAreas();
        a.area(5.3);
        a.area(6);
        a.area(5.5f,4.5f);
        a.area(4,5.3f);
    }
}
