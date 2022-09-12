package patternPrograms;

import java.util.Scanner;

public class PatternPro {
    /*
       ABCDE
       BCDE
       CDE
       DE
       D

     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter on of char");
        int num=sc.nextInt();
        for (int i=0;i<=num;i++){
            for (int j=i;j<=num;j++){
                System.out.print((char) (65+j)+ " ");
            }
            System.out.println();
        }
    }
}
