package com.atguigu.exer;

/**
 * 银行有一个账户
 * 有两个储户分别向同一个账户存3000元,每次存1000,存三次. 每次存1000 存完打印余额
 * @author Chris Jin
 * @create 2022-03-22 4:16 PM
 */

class Account{
    private double balance;
    public synchronized void  deposit(double amt){
        if(amt > 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance += amt;
            System.out.println("存钱成功! 余额为:" + balance);
        }
    }
}

class Customer extends Thread{
    private Account acct;

    public Customer(Account acct){
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account();
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.start();
        c2.start();
    }
}
