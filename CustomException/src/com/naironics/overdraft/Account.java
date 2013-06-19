package com.naironics.overdraft;

public class Account {

	private double balance = 1000.0;

	public void withdrawMoney(double amount) throws OverDraftException {
		if (amount > balance) {
			throw new OverDraftException("Insufficient Balance.");
		}
	}

	public static void main(String[] args) {
		// provide argument through command line
		double amount = Double.parseDouble(args[0]);

		Account checkingAccount = new Account();

		try {
			checkingAccount.withdrawMoney(amount);
		} catch (OverDraftException ode) {
			ode.printStackTrace();
		}

	}

}
