package StringPrograms;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String");
        String c= sc.nextLine();
        System.out.println("enter a character");
        char ch1=sc.next().charAt(0);
        char ch[]=c.toCharArray();
        int count=0;



            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == ch1) {
                    count++;
                    System.out.println(i + " ");
                }
            }
            System.out.println("and it occured" +" "+ count +" "+ "time");

        }
    }

