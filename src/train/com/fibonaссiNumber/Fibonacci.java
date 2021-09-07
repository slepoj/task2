package train.com.fibonaссiNumber;

import static java.lang.Math.sqrt;

public class Fibonacci {

    public static void main(String[] args) {
        verification(strToInt(args));
    }

    private static int fibonacci(int n) {
        int num = 1;
        int num2 = 1;
        while (num != n) {
            int buf = num2;
            num2 += num;
            num = buf;
        }
        return num2;
    }

    private static int strToInt(String[] args) {
        try {
            return Integer.parseInt(args[0]);
        } catch (Exception e) {
            return -1;
        }
    }

    private static void verification(int n) {
        //verification is user send words, not number
        if (n < 0) {
            System.out.println("incorrect data");
            return;
        }
        //verification is it number of fibonacci
        if (((sqrt(5 * (n * n) - 4) % 1) == 0) || ((sqrt(5 * (n * n) + 4) % 1) == 0)) {
            System.out.println("Next number : " + fibonacci(n));
        } else {
            System.out.println("this is not number of fibonacci");
        }
    }

}
