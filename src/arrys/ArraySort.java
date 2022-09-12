package arrys;

import java.util.Arrays;

public class ArraySort {
    void sorting(int a[]){
        int len=a.length;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if (a[j]>a[j+1]){
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("second gighest"+ a[len-2]);
        System.out.println("third minimum"+a[2]);
    }

    public static void main(String[] args) {
        int a[]={20,40,60,30,1,2,45,68};
        ArraySort ob=new ArraySort();
        ob.sorting(a);
    }
}
