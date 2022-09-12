package arrys;

import java.util.Scanner;

public class MoviesGetSetMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        MoviesGetSet mo[]=new MoviesGetSet[size];
        for (int i=0;i<size;i++){
            System.out.println("enter movies info");
            int id= sc.nextInt();
            String mname= sc.next();
            String producer1= sc.next();
            String year= sc.next();
            int collection=sc.nextInt();
            MoviesGetSet e=new MoviesGetSet();
            e.setId(id);
            e.setMname(mname);
            e.setProducer(producer1);
            e.setYear(year);
            e.setCollection(collection);
            mo[i]=e;



        }

    }
}
