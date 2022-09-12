package patternPrograms;

import java.util.Scanner;

public class PatternsameChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a rows");
        int rows=sc.nextInt();
        int alp=97;
        for (int i=0;i<=rows;i++){
            for (int j=0;j<=i;j++){
                System.out.print((char)(alp+j));
                alp++;
            }
            System.out.println();
        }
    }
}
