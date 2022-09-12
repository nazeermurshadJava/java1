package arrys;

import java.util.Scanner;

public class MoviesArrayObjMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        MoviesArrayObj m[] = new MoviesArrayObj[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter movies info");
            System.out.println("================");
            System.out.println("enter moviec id");
            int mid = sc.nextInt();
            System.out.println("enter ,movies name");
            String mName = sc.next();
            System.out.println("enter movies producer name");
            String producer = sc.next();
            System.out.println("enter movice release year");
            String releaseYear = sc.next();
            System.out.println("enter movies total collection");
            int boxOfficeCollection = sc.nextInt();
            m[i] = new MoviesArrayObj(mid, mName, producer, releaseYear, boxOfficeCollection);
        }
            for (MoviesArrayObj e:m) {

                if (e.boxOfficeCollection > 500000 && e.producer.equals("salmankhan"))
                    System.out.println(e.producer + " " + e.boxOfficeCollection);

               // System.out.println(e);


            }
        }
    }
