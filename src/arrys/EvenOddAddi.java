package arrys;

import java.util.Scanner;

public class EvenOddAddi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("enter elements");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int sume=0,sumo=0;
        for (int i=0;i<size;i++){

           if(arr[i]%2==0){
               sume=sume+arr[i];

            }else
           {
               sumo=sumo+arr[i];
           }

        }
        System.out.println("addition of sum numbers "+ sume);
        System.out.println("addition of odd numbers" + sumo);


    }
}
