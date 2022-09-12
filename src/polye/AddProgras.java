package polye;

public class AddProgras {

    void add(int a,int b){
        System.out.println("addition of numbers"+ (a+b));
    }
    void add(float a, float b){
        System.out.println("addition of decimal numbers"+ (a+b));
    }
    void add(int a,float b){
        System.out.println(" addition of int and float"+ (a+b));

    }
    void add(String a,int b, float c){
        System.out.println("addition is"+(a+b+c));{

        }

    }

    public static void main(String[] args) {
        AddProgras a=new AddProgras();
        a.add(20,30);
        a.add(3.4f,5.4f);
        a.add("abc",20,4.5f);
    }
}


