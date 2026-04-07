package banking;

public class LuhnAlgorithm {
    public static String generateCheckSum(String cardNumberWithoutCheckSum) {
        int length = cardNumberWithoutCheckSum.length(); // length = 15
        int sum = 0;
        for (int i = 0; i < length; i += 2) {
            int oddIndexNumber = (cardNumberWithoutCheckSum.charAt(i) - '0') * 2;
            int evenIndexNumber = 0;
            if ((i > 0) && (i < 14)) {
                evenIndexNumber = (cardNumberWithoutCheckSum.charAt(i + 1) - '0');
            }
            if (oddIndexNumber > 9) {
                oddIndexNumber -= 9;
            }
            sum += (oddIndexNumber + evenIndexNumber);
        }
        int checkSum = (10 - (sum % 10)) % 10;
        return checkSum + "";
    }
}
