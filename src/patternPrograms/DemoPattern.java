package patternPrograms;

import java.util.Scanner;

public class DemoPattern {
    public static void main(String[] args) {
       int r=4;
       char ch='a';
       for (int i=1;i<=r;i++){

           for (int k=1;k<=r-i;k++){
               System.out.print(" ");
           }
           for (int j=1;j<=i;j++){
               System.out.print(ch+" ");
           }
           ch++;
           System.out.println();


       }
       ch--;
       for (int i=r-1;i>=1;i--){
           ch--;
           for (int k=1;k<=r-1;k++){
               System.out.print(" ");
           }
           for (int j=1;j<=i;j++){
               System.out.print(ch+" ");
           }
           System.out.println();
       }
    }
}
