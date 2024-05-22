import java.util.Scanner;

public class Test {

    //This method checks if the provided password is correct. If the password is "JAVA", it returns true and prints "Password correct". Otherwise, it returns false and prints "Password wrong".
	//This method takes a String argument named pass and returns a boolean value. If the pass argument is equal to the string "JAVA", the method prints "Password correct" to the console and returns true. Otherwise, it prints "Password wrong" and returns false.
    public boolean Auth(String pass) {
        if (pass.equals("JAVA")) {
            System.out.println("Password correct");
            return true;
        } else {
            System.out.println("Password wrong");
            return false;
        }
    }

    //This method calculates the factorial of a given non-negative integer. The factorial of a number is the product of all positive integers less than or equal to that number.
    //This method takes an int argument named n and returns the factorial of n. If n is 0, the method returns 1. Otherwise, it recursively calls itself with the argument n - 1 and multiplies the result by n.
    public static int Factorial(int n) {
        if (n == 0) {
            return 1; 
        }
        return n * Factorial(n - 1); 
    }

   //This method calculates the nth number in the Fibonacci sequence. The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.
   //This method takes an int argument named n and returns the nth number in the Fibonacci sequence. If n is 0, the method returns 0. If n is 1, the method returns 1. Otherwise, it recursively calls itself with the arguments n - 1 and n - 2 and adds the results together.
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0; 
        } else if (n == 1) {
            return 1; 
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2); 
    }

   //This method checks if a given number is prime. A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    //This method takes an int argument named n and returns a boolean value indicating whether n is a prime number. If n is less than or equal to 1, the method returns false. Otherwise, it checks if n is divisible by any number between 2 and the square root of n. If n is divisible by any of these numbers, the method returns false. Otherwise, it returns true.
    public static boolean Prime(int n) {
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }

    //This method calculates the sum of the digits in a given string or integer. It first converts the input string to an integer and then iterates through each digit, adding them together.
    //This method takes a String argument named input and returns the sum of its digits. It initializes a variable named sum to 0 and then iterates through each character in the input string. If the character is a digit, it adds its numeric value to the sum variable. Finally, it returns the sum variable.
    public static int SumOfDigits(String input) {//This line declares the method with a name SumOfDigits, a return type of int, and a single parameter input of type String. The static keyword indicates that the method can be called without creating an instance of the class.
        int sum = 0; 
        for (int i = 0; i < input.length(); i++) { //This line starts a for loop that iterates over each character in the input string. The loop variable i is initialized to zero and will be incremented by one in each iteration until it reaches the length of the input string.
            if (Character.isDigit(input.charAt(i))) { //This line checks if the character at the current position in the input string is a digit. The Character.isDigit method returns true if the character is a digit and false otherwise.
                sum += Character.getNumericValue(input.charAt(i)); //If the character is a digit, this line adds its numeric value to the sum variable using the Character.getNumericValue method.
            }
        }
        return sum; 
    }

    //This method calculates the reverse of a given integer. It does this by repeatedly extracting the last digit from the number and appending it to a new number until the original number is 0.
    //This method takes an int argument named n and returns its reverse. It initializes a variable named reverse to 0 and then enters a loop that continues until n is 0. In each iteration of the loop, it extracts the last digit of n by taking the modulus 10, adds it to the
    public static int ReverseNumber(int n) {
        int reverse = 0; 
        while (n != 0) { 
            reverse = reverse * 10 + (n % 10); 
            n /= 10; 
        }
        return reverse; 
    }

    public static void main(String[] args) {
    	//This line creates a new Scanner object, which is used to read input from the console. The System.in argument specifies that the input should come from the console
        Scanner scanner = new Scanner(System.in);//A Scanner object is created to read input from the console 

        System.out.println("Enter your password:");//The program prompts the user to enter their password
        //This line reads a single word from the console and assigns it to the accessInput variable. The next() method of the Scanner class reads the next token from the input stream, which is assumed to be a word.
        String accessInput = scanner.next();// 

        Test t = new Test(); //This line creates a new instance of the Test class and assigns it to the t variable.
        boolean result = t.Auth(accessInput);//The Auth method of a Test object is called with the user's input to authenticate it
        int i = 1; //This line initializes the i variable to 1.
        //A while loop is used to allow the user three attempts to enter the correct password. If the password is incorrect, the loop prompts the user to try again and calls the Auth method again.
        
        while (i <= 3 && !result) { //This line starts a while loop that continues as long as i is less than or equal to 3 and the result variable is false.
            System.out.println("Incorrect password. Please try again (" + (3 - i) + " attempts left).");//This line prints an error message to the console, indicating that the password is incorrect and how many attempts are left.
            accessInput = scanner.next(); //This line reads the next word from the console and assigns it to the accessInput variable.
            result = t.Auth(accessInput); //This line calls the Auth method of the Test class again, passing the new accessInput value as an argument. The result is assigned to the result variable.
            i++;//This line increments the i variable by 1.
        }
        //If the user fails to enter the correct password after three attempts, the program prints "Access denied." and exits
        if (!result) {
            System.out.println("Access denied.");
        } else {//If the user enters the correct password, the program prints "Access to methods." and proceeds to offer several mathematical operations and calculations that the user can perform.
            System.out.println("Access to methods.");//This line prints a message to the console, indicating that access to the methods is granted

            //The program calculates the factorial of a non-negative integer entered by the user.
            System.out.println("Factorial Calculation:");//This line prints a message to the console, indicating that the factorial calculation is about to begin
            int number = -1;//This line initializes the number variable to -1
            //A while loop is used to ensure that the user enters a valid non-negative integer. If the input is invalid, the loop prompts the user to try again.
            while (number < 0) {//This line starts a while loop that continues as long as the number variable is less than 0
                System.out.println("Enter a non-negative integer:");//This line prints a message to the console, prompting the user to enter a non-negative integer.
                number = scanner.nextInt(); //This line reads an integer value from the console and assigns it to the number variable
                if (number < 0) {//This line starts an if statement that executes if the number variable is less than 0.
                    System.out.println("Invalid input. Please enter a non-negative integer.");//This line prints an error message to the console, indicating that the input is invalid
                }
            }
            System.out.println("Factorial: " + Factorial(number));//The Factorial method is called with the number variable as an argument, and the result of the method is concatenated with the string "Factorial: " using the + operator.
                                                                  //The System.out.println method then prints the resulting string to the console, displaying the factorial of the number variable.
           
            System.out.println("Fibonacci Sequence:");
            number = -1;
            while (number < 0) {
                System.out.println("Enter a non-negative integer:");
                number = scanner.nextInt(); 
                if (number < 0) {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            }
            System.out.println("Fibonacci number: " + Fibonacci(number));

            
            System.out.println("Prime Number Check:");
            number = 0;
            while (number <= 0) {
                System.out.println("Enter a positive integer:");
                number = scanner.nextInt(); 
                if (number <= 0) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            }
            System.out.println("Prime: " + Prime(number));

            
            System.out.println("Sum of Digits:");//
            System.out.println("Enter a positive integer or a string with multiple digits and/or operators:");//The user is prompted to enter a positive integer or a string with multiple digits and/or operators.
            String input = scanner.next(); //This line declares a variable named input of type String, and assigns it the value of the next input from the user, which is obtained using the scanner object.

            try {//This line starts a try block, which is used to catch exceptions that might be thrown in the block.
                int number2 = Integer.parseInt(input); //This line attempts to convert the input string to an integer using the parseInt method of the Integer class. If the input string contains a valid integer, this line assigns the integer value to a new variable named number2.
                if (number2 <= 0) {//This line checks if the number2 variable is less than or equal to zero.
                    System.out.println("Invalid input.");//If the number2 variable is less than or equal to zero, this line prints the text "Invalid input." to the console.
                } else {//This line starts an else block, which is executed if the number2 variable is greater than zero.
                    System.out.println("Sum of digits: " + SumOfDigits(String.valueOf(number2)));// If the number2 variable is greater than zero, this line prints the text "Sum of digits: " followed by the result of the SumOfDigits method, which is called with the number2 variable converted to a string as an argument.
                }
            } catch (NumberFormatException e) {//This line starts a catch block, which is executed if the parseInt method throws a NumberFormatException.
                System.out.println("Sum of digits: " + SumOfDigits(input));//If the parseInt method throws a NumberFormatException, this line prints the text "Sum of digits: " followed by the result of the SumOfDigits method, which is called with the input string as an argument
            }

            
            System.out.println("Reverse Number:");
            number = 0;//This line declares a variable named number of type int, and assigns it an initial value of zero.
            while (number <= 0) {// This line starts a while loop that continues as long as the number variable is less than or equal to zero.
                System.out.println("Enter a positive integer:");
                number = scanner.nextInt(); //This line reads the next integer input from the user using the scanner object, and assigns it to the number variable.
                if (number <= 0) {//This line checks if the number variable is less than or equal to zero.
                    System.out.println("Invalid input. Please enter a positive integer.");//
                }
            }
            System.out.println("Reversed number: " + ReverseNumber(number));//After the while loop has ended, this line prints the text "Reversed number: " followed by the result of the ReverseNumber method, which is called with the number variable as an argument.
        }

        scanner.close(); //This line closes the scanner object to release any system resources it was using.
    }
}
