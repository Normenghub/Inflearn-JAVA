package oop;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
        System.out.println("현재 잔액 = " + balance);
    }
    void withdraw(int amount){
        if (balance < amount){
            System.out.println("잔액 부족 입니다. " + "현재 잔액 = " + balance);

        }else{
            balance -= amount;
            System.out.println("현재 잔액 = " + balance);
        }
    }
    void accountStatus(){
        System.out.println("현재 잔액 = " + balance);
    }
}
