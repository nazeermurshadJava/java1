package patternPrograms;

import java.util.Scanner;

public class CharPatternSame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a rows");
        int rows=sc.nextInt();
        int letter=97;
        for (int i=0;i<=5;i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print((char) (letter + i) + " ");

            }
            System.out.println();

        }

    }
}
