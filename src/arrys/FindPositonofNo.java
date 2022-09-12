package arrys;

import java.util.Scanner;

public class FindPositonofNo {
  void positionFindIndex(int arr[], int search) {
        int count = 0;
        System.out.println("enter search element" + search);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                count++;
                System.out.println("element found at index" +" "+i);
            }
        }
        System.out.println("element"+ search+"repeated "+ count +" time");
    }

    public static void main(String[] args) {
        int search=35;
        int arr[]={10,20,35,24,78,50,40,35};
        FindPositonofNo f=new FindPositonofNo();
        f.positionFindIndex(arr,search);

    }
}
