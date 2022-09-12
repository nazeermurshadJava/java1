package tqtest1;

import java.util.Scanner;

public class FrequenyIntno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter a  Frequency numbers");
        int frequency= sc.nextInt();

        for (int i=0;i<=9; i++){
            int count=0;           //9686270461
            int temp=frequency;
            while (temp>0){

                int no=temp%10;
                if (no==i)
                {
                    count++;

                }
                temp=temp/10;

            }
            if (count>0){
                System.out.println(" frequency of numbers" + i  + " " +count);
            }

        }
    }
}
