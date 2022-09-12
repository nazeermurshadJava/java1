package tqtest2;

import java.util.Scanner;

public class PatternMethod {
    void starPattern(int r){
        for (int i=1;i<=r;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            System.out.println(" ");
        }
    }

    void numberPattern(int r){
        for (int i=1;i<=r;i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(1);
                } else
                    System.out.print(0);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternMethod p1=new PatternMethod();
        Scanner sc=new Scanner(System.in);
        System.out.println("1 star pattern");
        System.out.println("2 number pattern");
        System.out.println("enter a choise");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("enter a number");
                int s=sc.nextInt();
                p1.starPattern(s);
                break;

            case 2:
                System.out.println(" enter a number");
                int n=sc.nextInt();
                p1.numberPattern(n);
                break;

            default:
                System.out.println("enter a valid number");
        }
    }
}
