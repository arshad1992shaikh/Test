# Test
Java Program for Password-Protected Mathematical Calculations

This is a Java program that defines a class named Test with several methods for mathematical calculations and operations. The program includes methods for:

Authenticating a user's password. If the password is "JAVA", the method returns true and prints "Password correct". Otherwise, it returns false and prints "Password wrong".
Calculating the factorial of a given non-negative integer. The factorial of a number is the product of all positive integers less than or equal to that number.
Calculating the nth number in the Fibonacci sequence. The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.
Checking if a given number is prime. A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Calculating the sum of the digits in a given string or integer.
Calculating the reverse of a given integer.
The program includes a main method that creates a Scanner object to read input from the console, prompts the user to enter their password, and authenticates it using the Auth method. If the user fails to enter the correct password after three attempts, the program prints "Access denied." and exits.

If the user enters the correct password, the program prints "Access to methods." and proceeds to offer several mathematical operations and calculations that the user can perform. The user can calculate the factorial of a non-negative integer, the nth number in the Fibonacci sequence, check if a given number is prime, calculate the sum of the digits in a given string or integer, and calculate the reverse of a given integer.

The program uses loops and conditional statements to ensure that the user enters valid input for each calculation. If the user enters invalid input, the program prompts them to try again.

Overall, this program demonstrates several fundamental concepts in Java programming, including methods, loops, conditional statements, and input/output operations.
return sum; - Return the sum.
Method: ReverseNumber - This method reverses a given number.

Test project,output look like
Enter your password:
java
Password wrong
Incorrect password. Please try again (2 attempts left).

java
Password wrong
Incorrect password. Please try again (1 attempts left).
JAVA
Password correct
Access to methods.
Factorial Calculation:
Enter a non-negative integer:
5
Factorial: 120
Fibonacci Sequence:
Enter a non-negative integer:
6
Fibonacci number: 8
Prime Number Check:
Enter a positive integer:
13
Prime: true
Sum of Digits:
Enter a positive integer or a string with multiple digits and/or operators:
ab12cd12
Sum of digits: 6
Reverse Number:
Enter a positive integer:
1234567
Reversed number: 7654321
