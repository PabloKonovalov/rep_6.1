package bank;
import java.util.Date;

public class DepositAccount extends BankAccount {
    Date lastDate;
    public DepositAccount(){
        super();
    }
    
    public void withdrawMoney(double sum) {
        Date date = new Date();
        int days = (int)((date.getTime() - lastDate.getTime())/(24*60*60*1000));
        if (days <= 31){
            System.out.println("Вы не можете снимать деньги в течении месяца!");
            return;
        }
        if (amount >= sum) {
            amount -= sum;
        } else {
            System.out.println("Недостаточно денег на счёте!");
        }
    }

    public void putMoney(double sum) {
        lastDate = new Date();
        amount += sum;
    }
}
