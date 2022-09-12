package parametrMethod;

import java.util.Scanner;

public class FactPow {
    void fact(int a){
        int fact=1;
        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("factorial is"+ fact);
    }
    void power(int num,int power){
        int product=1;
        for (int i=1;i<=power;i++){
            product=product*num;
        }
        System.out.println(num+"^"+power+":"+product);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        System.out.println();
    }
}
