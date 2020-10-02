package bank;

public class BankAccount {

   protected double amount;

   public BankAccount(){
       amount = 0;
   }

    public boolean withdrawMoney(double sum) {
        if (amount >= sum) {
            amount -= sum;
            return true;
        } else {
            System.out.println("Недостаточно денег на счёте!");
            return false;
        }
    }

    public void putMoney(double sum) {
        amount += sum;
    }
    public void viewBalance(){
        System.out.printf("Остаток на счёте: %.2f руб.\n", amount);
    }

    public boolean send(BankAccount receiver, double amount){
       if(withdrawMoney(amount)){
           receiver.putMoney(amount);
       }
       return true;
    }


}
