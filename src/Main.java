import bank.BankAccount;
import bank.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        BankAccount account = new CreditAccount();

        account.putMoney(56);
        account.viewBalance();
        account.withdrawMoney(67);
        account.withdrawMoney(34);
        account.viewBalance();


    }
}
