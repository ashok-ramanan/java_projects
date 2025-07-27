package Basics;

import java.math.BigDecimal;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int num1=32, num2=20, i =1;
        BigDecimal  result;
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        num1 = input.nextInt();
//        System.out.print("Enter second number: ");
//        num2 = input.nextInt();
//        result = BigDecimal.valueOf(num1 / num2);
//
//        System.out.println(result);
//        System.out.println(num1 + " / " + num2 + " = " + result);
//        int a = 20, b = 10;
//        System.out.println("Addition: "+ (a+b));
//        System.out.println("Subtraction: "+ (a-b));
//        System.out.println("Multiplication: "+ a*b);
//        System.out.println("Division: "+ a/b);
//        System.out.println("Is a greater than b? "+ (a>b));
//        System.out.println("Is a > b and b > 0? "+ (a>b && b>0));
//        while (i<=10){
//            System.out.println("Hi " + i);
//            i++;
//        }
        for(i=0; i<6; i++){
            System.out.println("Day " + i);
            for(int j=9; j<18; j++){
                System.out.println("    " + ((j%12)==0?12:(j%12)) + "-" + ((j%12)+1));
                }
            }
        int x = 5;

        int y = 10;

        int z = (x++ > 5 && y-- < 10) ? x-- : y;
        System.out.println(z);
        }
}
