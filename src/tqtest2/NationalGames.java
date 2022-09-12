package tqtest2;

import java.util.Scanner;

public class NationalGames {
    void game(String countryname){
        switch (countryname){
            case "INDIA":
                System.out.println("national game is Hockey");
                break;

            case "BANGLADESH":
                System.out.println("Kabaddi");
                break;

            case "ITALY":
                System.out.println("FootBall");
                break;

            case "CHINA":
                System.out.println("Table Tennis");
                break;

            case "United":
                System.out.println("Base Ball");
                break;

            default:
                System.out.println("Invalid Country");


        }
    }

    public static void main(String[] args) {
        NationalGames n1=new NationalGames();
        Scanner sc=new Scanner(System.in);
        System.out.println("india");
        System.out.println("bangladesh");
        System.out.println("italy");
        System.out.println("china");
        System.out.println("united states");
        System.out.println();
        System.out.println("enter a country name");
        String countryname=sc.next();
        n1.game(countryname);
    }
}
