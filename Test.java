import java.util.Scanner;

public class Test {

    
    public boolean Auth(String pass) {
        if (pass.equals("JAVA")) {
            System.out.println("Password correct");
            return true;
        } else {
            System.out.println("Password wrong");
            return false;
        }
    }

    
    public static int Factorial(int n) {
        if (n == 0) {
            return 1; 
        }
        return n * Factorial(n - 1); 
    }

   
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0; 
        } else if (n == 1) {
            return 1; 
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2); 
    }

   
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

    
    public static int SumOfDigits(String input) {
        int sum = 0; 
        for (int i = 0; i < input.length(); i++) { 
            if (Character.isDigit(input.charAt(i))) { 
                sum += Character.getNumericValue(input.charAt(i)); 
            }
        }
        return sum; 
    }

    
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
