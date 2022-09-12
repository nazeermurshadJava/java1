package tqtestarray;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceSqr {
    void replaceNegative(int[] arr, int size) {

        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                arr[i] = arr[i - 1] * arr[i - 1];

                System.out.println("Array will be: ");
                System.out.println(Arrays.toString(arr));
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size=sc.nextInt();
        int arr[]= new int[size];

        System.out.println("Enter the elements of Array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

       ReplaceSqr r=new ReplaceSqr();
        r.replaceNegative(arr, size);


    }
}

