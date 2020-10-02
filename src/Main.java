import bank.BankAccount;
import bank.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        BankAccount account = new DepositAccount();

        account.putMoney(56);
        account.viewBalance();
        account.withdrawMoney(67);
        account.withdrawMoney(34);
        account.viewBalance();

        BankAccount account2 = new BankAccount();
        BankAccount account3 = new CreditAccount();

        account2.putMoney(90);
        account2.send(account3, 60);
        account2.viewBalance();
        account3.viewBalance();
    }
}
