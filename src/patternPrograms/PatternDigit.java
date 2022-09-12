package patternPrograms;

import java.util.Scanner;

public class PatternDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a rows");
        int rows=sc.nextInt();
        int no;
        for (int i=0;i<rows;i++){      //0<5
            no=1;
            for (int j=0;j<=i;j++){    //0
                System.out.print(no);
                no++;
            }
            System.out.println();

        }
    }
}
