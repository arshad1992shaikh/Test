/**
 * 
 */

import java.util.Scanner;//Import the Scanner class from the java.util package to read user input.

/**
 * 
 */
public class Test { //Define a public class named Test.
	
	//Method: Auth - This method checks if the provided password is correct.
	public boolean Auth(String pass) {//Define a public method named Auth that takes a String parameter and returns a boolean value.
		
		if (pass.equals("JAVA")) {// Check if the passed string is equal to "JAVA"
			System.out.println("password correct");//Print "password correct" if the condition is true.
     		return true;//Return true if the condition is true.
		}else { //Print "password wrong" if the condition is false
			System.out.println("password wrong");//Return false if the condition is false
			return false;//Return false if the condition is false
		}
		
	}
	//Method: Factorial - This method calculates the factorial of a given number.
	public static int Factorial(int n) {//Define a public static method named Factorial that takes an integer parameter and returns an integer value.
        if (n == 0) {
            return 1;//If the given number is 0, return 1 (base case).
        }
        return n * Factorial(n - 1);//If the given number is 0, return 1 (base case)
    }
//Method: Fibonacci - This method calculates the Fibonacci number of a given number.
    public static int Fibonacci(int n) {//Define a public static method named Fibonacci that takes an integer parameter and returns an integer value.
        if (n == 0) {
            return 0;//If the given number is 0, return 0 (base case).
        } else if (n == 1) {
            return 1;//If the given number is 1, return 1 (base case).
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);// Recursively call the Fibonacci method with the arguments (n-1) and (n-2) and add the results.
    }
//Method: Prime - This method checks if a given number is prime.
    public static boolean Prime(int n) {//Define a public static method named Prime that takes an integer parameter and returns a boolean value.
        if (n <= 1) {//If the given number is less than or equal to 1, return false (base case)
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {//Iterate from 2 to the square root of the given number.
            if (n % i == 0) {
                return false;//Check if the given number is divisible by the current iteration value. If yes, return false.
            }
        }
        return true;//If the loop completes without returning false, return true
    }
//Method: SumOfDigits - This method calculates the sum of digits of a given number or string.
    public static int SumOfDigits(String input) {//Define a public static method named SumOfDigits that takes a string parameter and returns an integer value.
        int sum = 0;//Initialize a variable named sum to 0.
        for (int i = 0; i < input.length(); i++) {//Iterate through the input string.
            if (Character.isDigit(input.charAt(i))) {//Check if the current character is a digit.
                sum += Character.getNumericValue(input.charAt(i));//If the character is a digit, add its numeric value to the sum.
            }
        }
        return sum;//Return the sum.
   
    }
//Method: ReverseNumber - This method reverses a given number
    public static int ReverseNumber(int n) {//This line defines a public static method called ReverseNumber that takes an integer n as an argument and returns an integer.
        int reverse = 0;//This line declares an integer variable called reverse and initializes it to 0.
        while (n != 0) {//This line starts a while loop that continues as long as n is not equal to 0.
            reverse = reverse * 10 + (n % 10);//This line calculates the reverse of the number by multiplying the current value of reverse by 10 and adding the remainder of n divided by 10.
            n /= 10;//This line divides n by 10 and assigns the result back to n.
        }
        return reverse;//This line returns the value of reverse as the result of the method.
    }
    public static void main(String[] args) {// This line defines the main method of the program, which is the entry point for running the program.
        //scanner class use to user input  and Scanner class from the java.util package to read user input.
        Scanner scanner = new Scanner(System.in);//This line creates a new Scanner object called scanner that reads input from the console.
        System.out.println("Enter your password:");//This line prints a message to the console asking the user to enter their password.
        String accessInput = scanner.next();// This line reads the user's input and stores it in a string variable called accessInput.

        Test t = new Test();//This line creates a new object of the Test class called t.
        boolean result = t.Auth(accessInput);// This line calls the Auth method of the Test class with accessInput as an argument and stores the result in a boolean variable called result.
        int i = 1 ;//This line declares an integer variable called i and initializes it to 1
        while(i<=3 && !result) {//This line starts a while loop that continues as long as i is less than or equal to 3 and result is false.
            System.out.println("Incorrect password. Please try again (" + (3 - i) + " attempts left).");//This line prints a message to the console indicating that the password was incorrect and how many attempts are left.
            accessInput = scanner.next();//This line reads the user's input again and stores it in accessInput.
            result = t.Auth(accessInput);//This line calls the Auth method again with the new value of accessInput.
            i++;//This line increments the value of i by 1.
        }
        if (!result) {// This line checks if result is false.
            System.out.println("Access denied.");//This line prints a message to the console indicating that access is denied.
        }else {//This line starts an else statement that is executed if result is true.
            System.out.println("Access to methods.");//This line prints a message to the console indicating that access to the methods is granted.
            System.out.println("Factorial Calculation:");//This line prints a message to the console indicating that the factorial calculation method is being called.
            System.out.println("Enter a non-negative integer:");//This line prompts the user to enter a non-negative integer.
            int number = scanner.nextInt();//This line reads the user's input and stores it in an integer variable called number.
            if (number < 0) {// This line checks if number is less than 0
                System.out.println("Invalid input.");
            } else {//This line indicates the beginning of the else block for the factorial calculation. If the user entered a non-negative integer, the factorial of that number will be calculated and printed to the console.
                System.out.println("Factorial: " + Factorial(number));//This line calls the Factorial method with the user's input as an argument and prints the result to the console.
            }

            System.out.println("Fibonacci Sequence:");//This line prints a message to the console indicating that the Fibonacci sequence calculation method is being called.
            System.out.println("Enter a non-negative integer:");//This line prompts the user to enter a non-negative integer.
            number = scanner.nextInt();//This line reads the user's input and stores it in the number variable.
            if (number < 0) {//This line checks if the user's input is negative
                System.out.println("Invalid input.");//This line prints a message to the console indicating that the user's input is invalid.
            } else {//This line indicates the beginning of the else block for the Fibonacci sequence calculation. If the user entered a non-negative integer, the Fibonacci number at that position will be calculated and printed to the console.
                System.out.println("Fibonacci number: " + Fibonacci(number));// This line calls the Fibonacci method with the user's input as an argument and prints the result to the console.
            }

            System.out.println("Prime Number Check:");//This line prints a message to the console indicating that the prime number check method is being called.
            System.out.println("Enter a positive integer:");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Invalid input.");
            } else {
                System.out.println("Prime: " + Prime(number));//This line calls the Prime method with the user's input as an argument and prints the result to the console.
            }

            System.out.println("Sum of Digits:");//This line prints a message to the console indicating that the sum of digits calculation method is being called.
            System.out.println("Enter a positive integer or a string with multiple digits and/or operators:");// This line prompts the user to enter a positive integer or a string with multiple digits and/or operators.
            String input = scanner.next();//This line reads the user's input and stores it in the input variable as a string.
            try {//This line indicates the beginning of a try block to handle potential exceptions
                int number2 = Integer.parseInt(input);//This line attempts to parse the user's input as an integer and store it in the number2 variable.
                if (number2 <= 0) {//This line checks if the parsed integer is non-positive
                    System.out.println("Invalid input.");
                } else {//This line indicates the beginning of the else block for the sum of digits calculation. If the user entered a positive integer, the sum of its digits will be calculated and printed to the console.
                    System.out.println("Sum of digits: " + SumOfDigits(String.valueOf(number2)));//This line calls the SumOfDigits method with the string representation of the user's input as an argument and prints the result to the console.
                }
            } catch (NumberFormatException e) {//this line catches any NumberFormatException that may occur when parsing the user's input as an integer. If the user enters a non-integer value, this block will be executed.
                System.out.println("Sum of digits: " + SumOfDigits(input));//This line calls the SumOfDigits method with the user's input as an argument and prints the result to the console.
            }

            System.out.println("Reverse Number:");//This line prints a message to the console indicating that the reverse number calculation method is being called.
            System.out.println("Enter a positive integer:");//This line prompts the user to enter a positive integer.
            number = scanner.nextInt();//This line reads the user's input and stores it in the number variable.
            if (number <= 0) {//This line checks if the user's input is non-positive.
                System.out.println("Invalid input.");
            } else {
                System.out.println("Reversed number: " + ReverseNumber(number));//This line calls the ReverseNumber method with the user's input as an argument and prints the result to the console.
            }
        }//Overall, this code prompts the user to enter a password, and if the password is correct, it grants access to various methods for calculating factorials, Fibonacci numbers, prime numbers, sums of digits, and reversed numbers. The code handles various edge cases, such as negative inputs and non-integer inputs, to ensure that the methods are called with valid inputs
    }
}

