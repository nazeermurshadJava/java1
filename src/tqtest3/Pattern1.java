package tqtest3;

/*
           9
          898
         78987
        6789876
 */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i=9;i>=1;i--){
            for (int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (int j=i;j<=9;j++){
                System.out.print(j+" ");
            }
            for (int j=9-1;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
