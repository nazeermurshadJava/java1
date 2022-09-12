package tqtestarray;

import java.util.Scanner;

public class SumRowCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Rows Size :");
        int r = sc.nextInt();
        System.out.println("Enter The Colum Size :");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter The Elements of Array :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<r;i++) {
            int sumrow = 0;
            for (int j = 0; j < c; j++) {
                sumrow = sumrow + arr[i][j];
                System.out.println("sum row" + (i + 1) + "is:" + sumrow);
            }
            System.out.println();
        }
            for (int i=0;i<r;i++){
                int sumcolumn=0;
                for (int j=0;j<c;j++) {
                   sumcolumn=sumcolumn+ arr[i][j];
                }
                    System.out.println("sum of column"+(i+1)+ "is"+sumcolumn);

            }
        }
    }
