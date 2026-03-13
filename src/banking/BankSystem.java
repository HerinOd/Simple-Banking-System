package banking;

public class BankSystem {
    private final banking.CardInformation[] accountList = new banking.CardInformation[10];
    private int numberOfAccounts = 0;

    public String storeAccount(banking.CardInformation account) {
        if (numberOfAccounts <= 9) {
            accountList[numberOfAccounts] = account;
            numberOfAccounts++;
            return "Your card has been created\n" +
                    "Your card number:\n" + account.getCardNumber() +
                    "\nYour card PIN:\n" + account.getPinNumber();
        } else {
            return "The bank's database is full, go use another bank :>";
        }
    }

    public banking.CardInformation logAccount(String cardNumber, String pinNumber) {
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accountList[i].getCardNumber().equals(cardNumber) && accountList[i].getPinNumber().equals(pinNumber)) {
                return accountList[i];
            }
        }
        return null;
    }

}
