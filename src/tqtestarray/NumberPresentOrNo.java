package tqtestarray;

import java.util.Scanner;

public class NumberPresentOrNo {

    void search(int arr[],int size){
        boolean found=false;
        for (int i=0;i<size;i++){
            if (arr[i] ==size){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("numbers is present");
        }else
            System.out.println("number is not present");
    }





    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter elememts");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter search num");
        int num=sc.nextInt();
        NumberPresentOrNo n=new NumberPresentOrNo();
        n.search(arr,size);
    }
}
