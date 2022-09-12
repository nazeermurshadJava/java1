package arrys;

import java.util.Scanner;

public class AlternativeNum {
    void alterNum(int arr[],int size){
        for (int i=0;i<size;i=i+2){
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("enter element");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        AlternativeNum a=new AlternativeNum();
        a.alterNum(arr,size);
    }
}
