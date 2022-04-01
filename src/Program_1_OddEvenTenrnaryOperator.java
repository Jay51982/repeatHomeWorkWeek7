
import java.util.Scanner;

/*
1. Write a java program that tells us that Input number is odd or even?
Hint : use ternary operator(?:)
 */
public class Program_1_OddEvenTenrnaryOperator {

    public static void main(String[] args) {
        // Scanner decaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        scanner.close();
    }

    //Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + "number");
    }
}
