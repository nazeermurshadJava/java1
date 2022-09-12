package tqtest3;

import java.util.Scanner;

public class Pattern2 {
    /*
    abcdef
    abcde
    abcd
    abc
    ab
    a
    a
    ab
    abc
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        for (int i=num-1;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print((char)+(j+64));
            }
            System.out.println();

        }
        for (int i=2;i<=num-1;i++){
            for (int j=1;j<=i;j++){
                System.out.print((char) +(j+64));
            }
            System.out.println();
        }
    }
}
