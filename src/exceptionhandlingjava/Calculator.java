package exceptionhandlingjava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a= sc.nextInt();
        System.out.println("enter second number");
        int b= sc.nextInt();
        int result;
        try {
            result=a/b;
            System.out.println("divi" +result);

        }catch (Exception e){
            System.out.println(e);
          //  e.printStackTrace();  show the exception on which line
        }
        result=a+b;
        System.out.println("add" +result);

        result=a*b;
        System.out.println("mul"+result);


        result=a-b;
        System.out.println("sun"+ result);
    }
}
