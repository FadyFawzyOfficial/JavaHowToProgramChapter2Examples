// Fig. 2.15: Comparison.java Author: Eng.Fady Fawzy
// compare integers using if statement, relational operators
// and equality operators. Created: 10/8/2016
import java.util.Scanner; // program uses class Scanner

public class Comparison {
    public static void main(String [] args) {
        // create a Scanner to obtain input form the command line
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second number from user

        if(number1 == number2){
            System.out.printf("%d == %d%n", number1, number2);
        }

        if(number1 != number2){
            System.out.printf("%d != %d%n", number1, number2);
        }

        if(number1 < number2){
            System.out.printf("%d < %d%n", number1, number2);
        }

        if(number1 > number2){
            System.out.printf("%d > %d%n", number1, number2);
        }

        if(number1 <= number2){
            System.out.printf("%d <= %d%n", number1, number2);
        }

        if(number1 >= number2){
            System.out.printf("%d >= %d%n", number1, number2);
        }
    } // end method main
} // end class Comparison