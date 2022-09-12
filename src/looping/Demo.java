package looping;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter limit");
        int limit= sc.nextInt();
       int a=1;
       while (a<=limit){

           System.out.println(a);
           a++;

        }

    }
}
