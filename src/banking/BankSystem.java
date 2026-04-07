package banking;

import java.util.HashMap;

public class BankSystem {
    private final HashMap<String, UserAccount> accountHashMap = new HashMap<>();

    public String storeAccount(UserAccount account) {
        accountHashMap.put(account.getCardNumber(), account);
        return "Your card has been created\n" +
                "Your card number:\n" + account.getCardNumber() +
                "\nYour card PIN:\n" + account.getPinNumber();
    }

    public UserAccount logAccount(String cardNumber, String pinNumber) {
        UserAccount user = accountHashMap.get(cardNumber);
        if ((user != null) && (user.getPinNumber().equals(pinNumber))) {
            return user;
        }
        return null;
    }

}