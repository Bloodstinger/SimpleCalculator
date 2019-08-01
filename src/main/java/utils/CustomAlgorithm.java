package utils;

public class CustomAlgorithm {

    public static String multiply(String num1, String num2) {
        if ((num1.charAt(0) == '-' || num2.charAt(0) == '-')
                && (num1.charAt(0) != '-' || num2.charAt(0) != '-')) {
            System.out.print("-");
        }
        if (num1.charAt(0) == '-' && num2.charAt(0) != '-') {
            num1 = num1.substring(1);
        } else if (num1.charAt(0) != '-' &&
                num2.charAt(0) == '-') {
            num2 = num2.substring(1);
        } else if (num1.charAt(0) == '-' &&
                num2.charAt(0) == '-') {
            num1 = num1.substring(1);
            num2 = num2.substring(1);
        }
        return calculate(num1, num2);
    }

    private static String calculate(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        if (length1 == 0 || length2 == 0) {
            return "0";
        }
        int[] result = new int[length1 + length2];
        int positionIndexFirst = 0;
        int positionIndexSecond = 0;
        for (int i = length1 - 1; i >= 0; i--) {
            int carry = 0;
            int n1 = num1.charAt(i) - '0';
            positionIndexSecond = 0;
            for (int j = length2 - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';
                int sum = n1 * n2 + result[positionIndexFirst + positionIndexSecond] + carry;
                carry = sum / 10;
                result[positionIndexFirst + positionIndexSecond] = sum % 10;
                positionIndexSecond++;
            }
            if (carry > 0) {
                result[positionIndexFirst + positionIndexSecond] += carry;
            }
            positionIndexFirst++;
        }
        int i = result.length - 1;
        while (i >= 0 && result[i] == 0) {
            i--;
        }
        if (i == -1) {
            return "0";
        }
        StringBuilder resultString = new StringBuilder();
        while (i >= 0) {
            resultString.append(result[i--]);
        }
        return resultString.toString();
    }
}
