package banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankSystem bankSystem = new BankSystem();
        UserAccount currentLoggedInAccount;

        while (true) {
            System.out.println("1. Create an account\n" +
                    "2. Log into account\n" +
                    "0. Exit");
            int choice = input.nextInt(); input.nextLine();
            switch (choice) {
                case 1 -> {
                    UserAccount account = new UserAccount();
                    System.out.println(bankSystem.storeAccount(account));
                }
                case 2 -> {
                    System.out.println("Enter your card number:");
                    String cardNumber = input.nextLine();
                    System.out.println("Enter your PIN:");
                    String pinNumber = input.nextLine();
                    currentLoggedInAccount = bankSystem.logAccount(cardNumber, pinNumber);
                    if (currentLoggedInAccount != null) {
                        System.out.println("\nYou have successfully logged in!\n");
                        while (currentLoggedInAccount != null) {
                            System.out.println("1. Balance\n" +
                                    "2. Log out\n" +
                                    "0. Exit\n");
                            String loggedInChoice = input.nextLine();
                            switch (loggedInChoice) {
                                case "1" -> System.out.println("Balance: " + currentLoggedInAccount.getBalance());
                                case "2" -> {
                                    currentLoggedInAccount = null;
                                    System.out.println("You have successfully logged out!\n");
                                }
                                case "0" -> {
                                    return;
                                }
                            }
                        }
                    } else {
                        System.out.println("Wrong card number or PIN!");
                    }
                }
                case 0 -> {
                    System.out.println("Bye!");
                    return;
                }
            }
        }

    }
}