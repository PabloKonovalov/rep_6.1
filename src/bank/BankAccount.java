package bank;

public class BankAccount {

   protected double amount;

   public BankAccount(){
       amount = 0;
   }

    public void withdrawMoney(double sum) {
        if (amount >= sum) {
            amount -= sum;
        } else {
            System.out.println("Недостаточно денег на счёте!");
        }
    }

    public void putMoney(double sum) {
        amount += sum;
    }
    public void viewBalance(){
        System.out.printf("Остаток на счёте: %.2f руб.\n", amount);
    }


}
