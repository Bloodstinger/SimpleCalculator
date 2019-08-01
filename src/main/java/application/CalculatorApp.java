package application;

import utils.BigIntegerAlgorithm;
import utils.CustomAlgorithm;

import java.io.IOException;

public class CalculatorApp {

    public static void main(String[] args) throws IOException {
        String algorithm = args[0];
        String str1 = args[1];
        String str2 = args[2];
        if (algorithm.equals("alg1")) {
            System.out.println(BigIntegerAlgorithm.multiply(str1, str2));
        } else if (algorithm.equals("alg2")) {
            System.out.println(CustomAlgorithm.multiply(str1, str2));
        } else {
            System.out.println("Wrong arguments. Should be [algNumber(alg1 or alg2)] " +
                    "[firstNumber] [secondNumber]");
        }
    }
}
