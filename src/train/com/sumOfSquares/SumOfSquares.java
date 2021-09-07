package train.com.sumOfSquares;

public class SumOfSquares {

    public static void main(String[] args) {
        verification(strToInt(args));
    }

    private static int squaresSum(int n) {
        int sum = 0;
        for (int i = n; i > 0; i--) {
            sum += n * n;
            n--;
        }
        return sum;
    }

    private static void verification(int n) {
        //verification is user send words, not number
        if (n < 0) {
            System.out.println("incorrect data");
            return;
        }
        if (n < 100) {
            System.out.println("Sum of squares : " + squaresSum(n));
        } else {
            System.out.println("number >100");
        }
    }

    private static int strToInt(String[] args) {
        try {
            return Integer.parseInt(args[0]);
        } catch (Exception e) {
            return -1;
        }
    }
}
