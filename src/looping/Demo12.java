package looping;

import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of lines");
        int n=sc.nextInt();
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print((char) (97+j));
            }
            System.out.println();
        }
    }
}
