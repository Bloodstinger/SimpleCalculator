package utils;

import java.math.BigInteger;

public class BigIntegerAlgorithm {

    public static String multiply(String num1, String num2) {
        BigInteger firstNumber = new BigInteger(num1);
        BigInteger secondNumber = new BigInteger(num2);
        return String.valueOf(firstNumber.multiply(secondNumber));
    }
}
