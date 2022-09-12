package arrys;

import java.util.Scanner;

public class NegativeNumCount {
    void countNum(int arr[],int size){
        int count=0;
        for (int i=0;i<size;i++){
            if (arr[i]<0){
                count=count+1;
            }
        }
        System.out.println("total negative numbers "+ count);
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
        NegativeNumCount n=new NegativeNumCount();
        n.countNum(arr,size);
    }
}
