package looping;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter number");
        int num= sc.nextInt();
        int r, sum=0,temp;
        temp=num;
        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if (temp==sum){
            System.out.println("palindrom");
        }
        else
            System.out.println("not palindrom");

    }
}
