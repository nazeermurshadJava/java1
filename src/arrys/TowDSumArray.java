package arrys;

import java.util.Scanner;

public class TowDSumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=3,c=3;
        int arr[][]=new int[r][c];
        System.out.println("enter the array elements ");
        int sum=0;
        for ( int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();


            }
        }

        for (int i=0;i<r;i++){
            for (int j=0;j<=c;j++){
                sum=sum+arr[i][j];
                System.out.println("addition of sum of array"+sum);

            }

        }
    }
}
