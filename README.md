# Test
Java Program for Password-Protected Mathematical Calculations
Test project

class named Test with several methods for calculating factorials, Fibonacci numbers, prime numbers, sum of digits, and reversing a number. The main method is used to handle user input for password authentication and method selection.

when you use the == operator to compare two strings, you are actually comparing their memory addresses. On the other hand, the .equals() method checks if the two strings have the same value, regardless of their memory locations. 
.equal() method.
Here's a brief explanation of the code:

1 The Auth method takes a string as an argument and checks if it equals "JAVA". If it does, the method returns true and prints "password correct". Otherwise, it returns false and prints "password wrong".

2 The Factorial method is a recursive function that calculates the factorial of a given non-negative integer n.

3 The Fibonacci method is a recursive function that calculates the nth Fibonacci number.

4 The Prime method checks if a given positive integer n is prime or not.

6 The ReverseNumber method reverses a given positive integer n.

7 The main method uses a Scanner object to get user input for password authentication. If the password is correct, the user is granted access to the methods. 
8 The user can then choose which method to use by entering the corresponding number. The main method will then take user input for the selected method and print the result.
To use this code, you can compile and run it using a Java compiler. When you run the program, you will be prompted to enter a password. If the password is correct, you will be granted access to the methods and can choose which method to use.

sum of digits
This updated main method checks if the user input is a single positive integer or a string with multiple digits and/or operators. If it's a single positive integer, it converts it to an integer and calls the original SumOfDigits method. If it's a string with multiple digits and/or operators, it splits the input string by the "+" operator and calls the SumOfDigits method for each resulting string. It then adds up the results and prints the final sum.

With these modifications, the program should now be able to handle user input for the sum of digits calculation that contains multiple digits and/or operators.

This is a Java program that defines a class named Test with several methods for various mathematical and string operations. It also includes a main method to demonstrate the usage of these methods. Here's an explanation of the code line by line:

import java.util.Scanner; - Import the Scanner class from the java.util package to read user input.

Class declaration: public class Test { ... } - Define a public class named Test.

Method: Auth - This method checks if the provided password is correct.

public boolean Auth(String pass) { ... } - Define a public method named Auth that takes a String parameter and returns a boolean value.
if (pass.equals("JAVA")) { ... } - Check if the passed string is equal to "JAVA".
System.out.println("password correct"); - Print "password correct" if the condition is true.
return true; - Return true if the condition is true.
System.out.println("password wrong"); - Print "password wrong" if the condition is false.
return false; - Return false if the condition is false.
Method: Factorial - This method calculates the factorial of a given number.

public static int Factorial(int n) { ... } - Define a public static method named Factorial that takes an integer parameter and returns an integer value.
if (n == 0) { return 1; } - If the given number is 0, return 1 (base case).
return n * Factorial(n - 1); - If the given number is 0, return 1 (base case).
Method: Fibonacci - This method calculates the Fibonacci number of a given number.

public static int Fibonacci(int n) { ... } - Define a public static method named Fibonacci that takes an integer parameter and returns an integer value.
if (n == 0) { return 0; } - If the given number is 0, return 0 (base case).
if (n == 1) { return 1; } - If the given number is 1, return 1 (base case).
return Fibonacci(n - 1) + Fibonacci(n - 2); - Recursively call the Fibonacci method with the arguments (n-1) and (n-2) and add the results.
Method: Prime - This method checks if a given number is prime.

public static boolean Prime(int n) { ... } - Define a public static method named Prime that takes an integer parameter and returns a boolean value.
if (n <= 1) { return false; } - If the given number is less than or equal to 1, return false (base case).
for (int i = 2; i <= Math.sqrt(n); i++) { ... } - Iterate from 2 to the square root of the given number.
if (n % i == 0) { return false; } - Check if the given number is divisible by the current iteration value. If yes, return false.
return true; - If the loop completes without returning false, return true.
Method: SumOfDigits - This method calculates the sum of digits of a given number or string.

public static int SumOfDigits(String input) { ... } - Define a public static method named SumOfDigits that takes a string parameter and returns an integer value.
int sum = 0; - Initialize a variable named sum to 0.
for (int i = 0; i < input.length(); i++) { ... } - Iterate through the input string.
Character.isDigit(input.charAt(i)) - Check if the current character is a digit.
sum += Character.getNumericValue(input.charAt(i)); - If the character is a digit, add its numeric value to the sum.
return sum; - Return the sum.
Method: ReverseNumber - This method reverses a given number
