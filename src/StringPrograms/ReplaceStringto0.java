package StringPrograms;

import java.util.Scanner;

public class ReplaceStringto0 {
    public static void main(String[] args) {
        String s="java ia a programming language";
        int count=0;
        char ch[]=s.toCharArray();
        for (int i=0;i<ch.length;i++){
            count=1;
            char c=ch[i];
            for (int j=i+1;j<ch.length;j++){
                if (ch[j]==c){
                    count++;
                    ch[j]='0';
                }
            }
            System.out.println(c+" "+count);
        }
    }
}
