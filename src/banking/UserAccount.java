package banking;

import java.util.Random;

public class UserAccount {
    private final String cardNumber;
    private final String pinNumber;
    private final long balance;

    public UserAccount() {
        Random rand = new Random();
        balance = 0;
        // Create binNumber:
        String binNumber = "400000";
        // Create accountIdentifier:
        int accountRandomNumber = rand.nextInt(1_000_000_000);
        String accountIdentifier = String.format("%09d", accountRandomNumber);
        // Create checkSum:
        String checkSum = LuhnAlgorithm.generateCheckSum(binNumber + accountIdentifier);

        // cardNumber:
        this.cardNumber = binNumber + accountIdentifier + checkSum;

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