package StringPrograms;

import java.util.Scanner;

public class PrintUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.println("ENTER A STRINGS");
           String str=sc.next();
        for (int i = 0; i < str.length(); i++) {
            int flag=0;

            for (int j = 0; j < str.length(); j++) {

                if (i != j && str.charAt(i) == str.charAt(j)) {

                    flag++;
                    break;

                }
            }
            if (flag == 1) {
                System.out.println(str.charAt(i));

            }

        }
    }
    }
