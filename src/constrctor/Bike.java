package constrctor;

import java.util.Scanner;

public class Bike {
    int id;
    String name,brand,engin,color,paymentMode;
    double price,finalAmt;

    Bike(int i,String n,String b,String e,String c, double pr,String p){
        id=i;
        name=n;
        brand=b;
        engin=e;
        color=c;
        price=pr;
        paymentMode=p;

        }
    void discont(){

        if (paymentMode.equals("cash")){
            finalAmt=price*20/100;
            finalAmt=finalAmt-price;
            System.out.println("discount aount in cash "+finalAmt);

        } else if (paymentMode.equals("online")) {
            finalAmt=price*10/100;
            finalAmt=finalAmt-price;
            System.out.println("discount amount in online"+finalAmt);

        }
    } public String toString(){
        return id+" "+name+" "+brand+" "+engin+" "+color+" "+price+" "+paymentMode;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        int id= sc.nextInt();
        System.out.println("enter name");
        String name=sc.next();
        System.out.println(" enter brand");
        String brand=sc.next();
        System.out.println("enter engin");
        String engin=sc.next();
        System.out.println("enter color");
        String color=sc.next();
        System.out.println("enter price");
        double price=sc.nextDouble();
        System.out.println("enter paymentmode(cash/online)");

        String paymentMode=sc.next();
        Bike b1=new Bike(id,name,brand,engin,color,price,paymentMode);
        b1.discont();
        System.out.println(b1);
    }
}
