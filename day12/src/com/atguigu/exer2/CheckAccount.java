package com.atguigu.exer2;

public class CheckAccount extends Account{
	private double overdraft;
	
	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	@Override
	public void withdraw(double amt) {
		if(this.getBalance() >= amt){
			//方式一：
//			setBalance(getBalance() - amt);
			//方式二：
			super.withdraw(amt);
		}else if(overdraft >= amt - getBalance()){//透支额度 + 余额足够消费
			overdraft -= (amt - getBalance());
//			setBalance(0);
			//或
			super.withdraw(getBalance());
		}else{
			System.out.println("余额不足");
		}
	}

	public double getOverdraft() {
		// TODO Auto-generated method stub
		return this.overdraft;
	}
}
