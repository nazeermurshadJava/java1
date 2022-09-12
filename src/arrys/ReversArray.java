package arrys;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class ReversArray {
    void reverse(int arr[],int size){
        int temo=0;
        for(int i=0;i<size/2;i++){
            temo=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temo;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size =sc.nextInt();

        int arr[]=new int[size];
        System.out.println("enter array elments");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        ReversArray a=new ReversArray();
        a.reverse(arr,size);
    }
}
