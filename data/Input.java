package data;

import java.util.Scanner;

public class Input {
    private static final Scanner input = new Scanner(System.in);
//    public int val = 100;

    public static int nextInt() {
        return input.nextInt();
    }
    public static String nextLine() {
        return input.nextLine();
    }
    public static double nextDouble() {
        return input.nextDouble();
    }
    public static float nextFloat() {
        return input.nextFloat();
    }
    public static boolean nextBoolean() {
        return input.nextBoolean();
    }
    public static String next() {
        return input.next();
    }

    public static void close() {
        input.close();
    }
}
