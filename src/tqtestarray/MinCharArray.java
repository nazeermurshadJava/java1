package tqtestarray;

import java.util.Arrays;

public class MinCharArray {
    void minchar(char arr[]){
        char min='a';
        for (char i=0;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
            System.out.println("minimum char is"+min);
            System.out.println(" ");
        }


    }
    void display(char arr []){
        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args) {
        char arr[]={'A','D','E','X','Z','r'};
        MinCharArray m=new MinCharArray();
        m.minchar(arr);
        m.display(arr);
    }
}
