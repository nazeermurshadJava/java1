package StringPrograms;

import java.util.Scanner;

public class CountnuminString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int sum=0;
        for (int i=0;i< ch.length;i++){if (ch[i]>'0'&& ch[i]<='9'){

                sum=sum+(ch[i]-48);

            }
        }
        System.out.println("Addition of numbers: "+ sum);

    }

}
