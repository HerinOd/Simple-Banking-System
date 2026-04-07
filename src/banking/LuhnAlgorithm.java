package banking;

public class LuhnAlgorithm {
    public static String generateCheckSum(String cardNumberWithoutCheckSum) {
        int length = cardNumberWithoutCheckSum.length(); // length = 15
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int number;
            if ((i % 2) == 0) {
                number = (cardNumberWithoutCheckSum.charAt(i) - '0') * 2;
                if (number > 9) {
                    number -= 9;
                }
            } else {
                number = cardNumberWithoutCheckSum.charAt(i) - '0';
            }
            sum += number;
        }
        int checkSum = (10 - (sum % 10)) % 10;
        return checkSum + "";
    }
}
