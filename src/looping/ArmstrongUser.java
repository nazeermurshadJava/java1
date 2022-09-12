package looping;

import java.util.Scanner;

public class ArmstrongUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int num=sc.nextInt();
        int count=0,temp;
        temp=num;
        while (temp!=0){            //153      15         1       t=0
            count++;                //c=1      c=2      c=3
            temp=temp/10;            //15      t=1       t=0

        }
        temp=num;                           //153
        int sum=0;
        while (temp!=0){
            int product=1;
            int result=temp%10;            //r=3
            for (int i=1;i<count;i++){       //i=1     i=2    i=3   i=4(false)
                product=product*result;        //1*3=3 3*3=9 3*9=27

            }
            sum=sum+product;
            temp=temp/10;


        }if (sum==num){
            System.out.println("number is armstron");

        }else System.out.println("number is not armstrong");
    }
}
