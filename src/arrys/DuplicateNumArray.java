package arrys;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumArray {
    static void removeDuplicateElements(int arr[],int n){
        int temp[]=new int[n];
        int j=0;
        for (int i=0;i<n-1;i++){
            if (arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[n-1];
        System.out.println(Arrays.toString(temp));

    }

    public static void main(String[] args) {
        int a1[]={1,2,3,4,5,6};
        int b1[]={4,5,6,7,8,9};
        int len=a1.length+b1.length;

        int c1[]=new int[len];

        for (int i=0;i< a1.length;i++){
            c1[i]=a1[i];
        }
        int a=a1.length;
        for (int j=0;j< b1.length;j++){
            c1[a+j]=b1[j];
        }
       // System.out.println(Arrays.toString(c1));
        Arrays.sort(c1);
        System.out.println(Arrays.toString(c1));
        removeDuplicateElements(c1,len);
    }
}
