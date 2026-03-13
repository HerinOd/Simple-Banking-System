package banking;

import java.util.Random;

public class CardInformation {
    private final String cardNumber;
    private final String pinNumber;
    private final long balance;

    public CardInformation() {
        String checkDigit = "0";
        String binNumber = "400000";
        balance = 0;

        // cardNumber:
        Random rand = new Random();
        int accountRandomNumber = rand.nextInt(1_000_000_000);
        String accountNumber = String.format("%09d", accountRandomNumber);
        this.cardNumber = binNumber + accountNumber + checkDigit;

        // pinNumber:
        int pinRandomNumber = rand.nextInt(10_000);
        this.pinNumber = String.format("%04d", pinRandomNumber);
    }

    //Getters:

    public String getCardNumber() {
        return cardNumber;
    }
    public String getPinNumber() {
        return pinNumber;
    }

    public long getBalance() {
        return balance;
    }

}
