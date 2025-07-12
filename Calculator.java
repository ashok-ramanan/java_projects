import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int multi(int a, int b){
        return a*b;
    }
    public static double divide(int a, int b){
        return (double) a /b;
    }
    public static int square(int a){
        return a*a;
    }
    public static int cube(int a){
        return a*a*a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";

        System.out.println("Welcome to the Calculator!");

        while (again.equalsIgnoreCase("y")){

            System.out.println("""
                    1. Addition
                    2. Subtraction
                    3. Multiplication
                    4. Division
                    5. Square
                    6. Cube
                    """);

            System.out.print("Choose the correct number for the operation: ");
            int operation = input.nextInt();

            switch (operation){
                case 1 -> {
                    System.out.print("Enter first number: ");
                    int a = input.nextInt();
                    System.out.print("Enter second number: ");
                    int b = input.nextInt();
                    System.out.println("Result: " + add(a, b));
                }
                case 2 -> {
                    System.out.print("Enter first number: ");
                    int a = input.nextInt();
                    System.out.print("Enter second number: ");
                    int b = input.nextInt();
                    System.out.println("Result: " + sub(a, b));
                }
                case 3 -> {
                    System.out.print("Enter first number: ");
                    int a = input.nextInt();
                    System.out.print("Enter second number: ");
                    int b = input.nextInt();
                    System.out.println("Result: " + multi(a, b));
                }
                case 4 -> {
                    System.out.print("Enter first number: ");
                    int a = input.nextInt();
                    System.out.print("Enter second number: ");
                    int b = input.nextInt();
                    if (b == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + divide(a, b));
                    }
                }
                case 5 -> {
                    System.out.print("Enter a number to square: ");
                    System.out.println("Result: " + square(input.nextInt()));
                }
                case 6 -> {
                    System.out.print("Enter a number to cube: ");
                    System.out.println("Result: " + cube(input.nextInt()));
                }
                default -> System.out.println("Invalid operation. Please try again.");
            }


            System.out.print("Do you want to continue? (y/n): ");
            String res = input.next();

            if(res.equalsIgnoreCase("y"))
                again = "y";
            else if (res.equalsIgnoreCase("n"))
                again = "n";

        }
        System.out.println("Thank you for using the calculator.");


    }
}
