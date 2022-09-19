package exceptionhandlingjava;

import java.util.Scanner;

public class ExceptionFainally {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        int a=100,b=0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("fainally bolck");
        }
    }
}
