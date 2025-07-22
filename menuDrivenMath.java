import java.util.*;

public class menuDrivenMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("********** MENU **********");
            System.out.println("1. Print Table of a Number");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter a number to print its table: ");
                    int n = sc.nextInt();
                    System.out.println("Table of " + n + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(n + " * " + i + " = " + (n * i));
                    }
                    break;
                }

                case 2: {
                    System.out.print("Enter a number to calculate factorial: ");
                    int n = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial of " + n + " is: " + fact);
                    break;
                }

                case 3: {
                    System.out.print("Enter a number to check if it's prime: ");
                    int n = sc.nextInt();
                    int count = 0;
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0) {
                            count++;
                        }
                    }
                    if (count == 2)
                        System.out.println(n + " is a prime number.");
                    else
                        System.out.println(n + " is not a prime number.");
                    break;
                }

                case 4: {
                    System.out.println("First 10 numbers of the Fibonacci series:");
                    int a = 0, b = 1, c;
                    System.out.print(a + " " + b + " ");
                    for (int i = 3; i <= 10; i++) {
                        c = a + b;
                        System.out.print(c + " ");
                        a = b;
                        b = c;
                    }
                    System.out.println(); 
                    break;
                }

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }

            System.out.println(); 
        } while (choice != 5);

        sc.close();
    }
}
