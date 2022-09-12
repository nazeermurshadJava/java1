package looping;

import java.util.Scanner;

public class PrintNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size");
        int size= sc.nextInt();
       // int no;
        for (int i=0;i<size;i++) {
           // no=1;
            for (int j = 0; j <= i; j++) {
             //   System.out.print(no + " ");
              //no++;
            }
            System.out.println();
        }
    }
}
