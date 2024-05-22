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
    public static int SumOfDigits(String input) {
        int sum = 0; 
        for (int i = 0; i < input.length(); i++) { 
            if (Character.isDigit(input.charAt(i))) { 
                sum += Character.getNumericValue(input.charAt(i)); 
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
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter your password:");
        String accessInput = scanner.next(); 

        Test t = new Test(); 
        boolean result = t.Auth(accessInput); 

        int i = 1; 
        while (i <= 3 && !result) { 
            System.out.println("Incorrect password. Please try again (" + (3 - i) + " attempts left).");
            accessInput = scanner.next(); 
            result = t.Auth(accessInput); 
            i++; 
        }

        if (!result) {
            System.out.println("Access denied.");
        } else {
            System.out.println("Access to methods.");

            
            System.out.println("Factorial Calculation:");
            int number = -1;
            while (number < 0) {
                System.out.println("Enter a non-negative integer:");
                number = scanner.nextInt(); 
                if (number < 0) {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            }
            System.out.println("Factorial: " + Factorial(number));

           
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

            
            System.out.println("Sum of Digits:");
            System.out.println("Enter a positive integer or a string with multiple digits and/or operators:");
            String input = scanner.next(); 

            try {
                int number2 = Integer.parseInt(input); 
                if (number2 <= 0) {
                    System.out.println("Invalid input.");
                } else {
                    System.out.println("Sum of digits: " + SumOfDigits(String.valueOf(number2)));
                }
            } catch (NumberFormatException e) {
                System.out.println("Sum of digits: " + SumOfDigits(input));
            }

            
            System.out.println("Reverse Number:");
            number = 0;
            while (number <= 0) {
                System.out.println("Enter a positive integer:");
                number = scanner.nextInt(); 
                if (number <= 0) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            }
            System.out.println("Reversed number: " + ReverseNumber(number));
        }

        scanner.close(); 
    }
}
