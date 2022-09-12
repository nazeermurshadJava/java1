package arrys;

import java.util.Arrays;
import java.util.Scanner;

public class NumberReplace {
    void replaceNegative(int arr[],int size){
        for (int i=0;i<size;i++){
            if (arr[i]<0){
                arr[i]=arr[i-1]*arr[i-1];
            }
        }
        System.out.println("REPLACE NUMBER"+ Arrays.toString(arr));
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("enter the element");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        NumberReplace n1=new NumberReplace();
        n1.replaceNegative(arr,size);
    }
}
