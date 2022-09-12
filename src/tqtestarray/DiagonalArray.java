package tqtestarray;

import java.util.Scanner;

public class DiagonalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows size");
        int r= sc.nextInt();
        System.out.println("enter the column size");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        System.out.println("enter elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for (int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
            }
        }
            System.out.println("sum of diagonal element is : "+sum);

    }
}
