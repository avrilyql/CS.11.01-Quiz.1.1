import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Avril
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your favourite food: ");
        String favouriteFood = scanner.nextLine();
        System.out.println("First name: " + firstName + "\nAge: " + age + "\nFavourite Food: " + favouriteFood);

    }

}
