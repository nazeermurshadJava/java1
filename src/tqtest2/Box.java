package tqtest2;

import java.util.Scanner;

public class Box{
    void volume(int l,int w,int h){
        int volume=l*w*h;
        System.out.println("volume of box in cm"+ volume);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length cm");
        int l= sc.nextInt();
        System.out.println("enter the width cm");
        int w= sc.nextInt();
        System.out.println("enter the hight cm");
        int h= sc.nextInt();
        Box b1=new Box();
        b1.volume(l,w,h);
    }
        }
