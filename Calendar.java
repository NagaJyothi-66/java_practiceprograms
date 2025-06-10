package jyothi;
import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        String day = scan.nextLine().toLowerCase();

        switch(day) {
            case "monday":
                System.out.println("Let's learn Python");
                break;

            case "tuesday":
                System.out.println("Let's learn Java");
                break;

            case "wednesday":
                System.out.println("Let's learn C");
                break;

            case "thursday":
                System.out.println("Let's learn C++");
                break;

            case "friday":
                System.out.println("Let's learn HTML");
                break;

            case "saturday":
                System.out.println("Let's learn DBMS");
                break;

            default:
                System.out.println("Choose a correct option");
                break;
        }
        scan.close();
    }
}