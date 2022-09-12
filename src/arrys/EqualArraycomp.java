package arrys;

import java.util.Scanner;

public class EqualArraycomp {

    void euqualArray(int a[],int b[],int size){
        int count=0;
        if (a.length==b.length){
            for (int i=0;i<a.length;i++){
                if (a[i]==b[i]){
                    count ++;
                }
                else{
                    System.out.println("element are different");
                    break;
                }
            }
            if (count==a.length) {
                System.out.println("both array is equal");
            }
        }else
            System.out.println("both array not equal");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of arrays");
        int size=sc.nextInt();

        int a[]=new int[size];
        System.out.println("enter first array elements");
        for (int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        int b []=new int[size];
        System.out.println("enter second array elements");
        for (int i=0;i<size;i++){
            b[i]=sc.nextInt();
        }
        EqualArraycomp e=new EqualArraycomp();
        e.euqualArray(a,b,size);
    }
}
