package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public method ; deposit;


    public void deposit(int amount){
        if(isAmountValid(amount)){
        balance += amount;}
        else{
            System.out.println("Insufficient balance");
        }
    }

    private boolean isAmountValid(int amount){

        return amount >0;
    }

    // public method : withdraw

    public void withdraw(int amount){
        if(isAmountValid(amount) && balance >= amount){
            balance -= amount;
        }else {
            System.out.println("Insufficient balance");
        }
    }

    // public method : getBalance
    public int getBalance() {
        return balance;
    }


}
