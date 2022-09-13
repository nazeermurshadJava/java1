package tqteststr;

import java.util.Scanner;

public class CountAlphDigitChar {
    public static void main(String[] args) {
        int alph=0;
        int digit=0;
        int sChar=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter alpha spacial character string : ");
        String str=sc.nextLine();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch>='a' && ch<='z' || ch>'A' && ch<='Z'){
                alph++;

            }else if (ch>='0'&& ch<='9'){
                digit++;
            }
            else {
                sChar++ ;
            }
        }
        System.out.println("number of alphabet character :" +alph);
        System.out.println("number of digits character : " +digit);
        System.out.println("number of spacial character :" +sChar);
    }
}
