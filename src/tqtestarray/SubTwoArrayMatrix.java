package tqtestarray;

import java.util.Scanner;

public class SubTwoArrayMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the row size");
        int r= sc.nextInt();
        System.out.println("enter the size column");
        int c= sc.nextInt();


        int a[][]=new int[r][c];
        System.out.println("enter 1 matrix elemnts array");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                a[i][j]= sc.nextInt();
            }
        }
        int b[][]=new int[r][c];
        System.out.println("enter 2 matrix elemnts array");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                b[i][j]= sc.nextInt();
            }
        }
        int sub[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                sub[i][j]= a[i][j]-b[i][j];
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(sub[i][j]+" ");
            }
        }
    }
}
