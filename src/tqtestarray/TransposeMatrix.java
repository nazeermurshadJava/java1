package tqtestarray;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the row size");
        int r= sc.nextInt();
        System.out.println("enter the column size ");
        int c=sc.nextInt();

        int arr[][]= new int[r][c];
        System.out.println("enter the element of array");
        for (int i=0;i<r;i++ ) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("TRANSPOSE ARRAY");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}
