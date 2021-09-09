package train.com;

import train.com.fibonaссiNumber.Fibonacci;
import train.com.sumOfSquares.SumOfSquares;
import train.com.vote.Vote;

public class Main {
    public static void main(String[] args) {
        Vote.main(new String[]{"0", "0", "1", "1"});
        Vote.main(new String[]{"0", "0", "1"});
        Vote.main(new String[]{"0", "1"});
        Vote.main(new String[]{"0"});

        Fibonacci.main(new String[]{"1"});
        Fibonacci.main(new String[]{"4"});
        Fibonacci.main(new String[]{"21"});
        Fibonacci.main(new String[]{"100"});

        SumOfSquares.main(new String[]{"1"});
        SumOfSquares.main(new String[]{"3"});
        SumOfSquares.main(new String[]{"77"});
        SumOfSquares.main(new String[]{"13"});
        //some comment
    }
}
