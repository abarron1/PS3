package ACC;

import java.util.Date;

public class Account {

	private double balance;
	private double annualInterestRate;
	private int id;
	private Date dateCreated;

	public Account() {
		this.balance = 0;
		this.annualInterestRate = 0;
		this.id = 0;
		this.dateCreated = new Date();
	}

	public Account(int id, double balance, double annualInterestRate) {
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.id = id;
		this.dateCreated = new Date();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double monthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance)
			balance -= amount;
		else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
}
