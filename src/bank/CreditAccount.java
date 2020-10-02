package bank;

public class CreditAccount extends BankAccount {

    public CreditAccount() {
        super();
    }

    public void withdrawMoney(double sum) {
        double bankCommission = sum * 0.01;
        sum += bankCommission;
        if (amount >= sum) {
            amount -= sum;
            System.out.printf("Комиссия банка составила: %.2f руб.\n", bankCommission);
        } else {
            System.out.println("Недостаточно денег на счёте!");
        }
    }
}
