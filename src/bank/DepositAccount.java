package bank;
import java.util.Date;

public class DepositAccount extends BankAccount {

    private Date lastDate;

    public DepositAccount(){
        super();
    }
    
    public boolean withdrawMoney(double sum) {
        Date date = new Date();
        int days = (int)((date.getTime() - lastDate.getTime())/(24*60*60*1000));
        if (days <= 31){
            System.out.println("Вы не можете снимать деньги в течении месяца!");
            return false;
        }
        if (amount >= sum) {
            amount -= sum;
            return true;
        } else {
            System.out.println("Недостаточно денег на счёте!");
            return false;
        }
    }

    public void putMoney(double sum) {
        lastDate = new Date();
        amount += sum;
    }
}
