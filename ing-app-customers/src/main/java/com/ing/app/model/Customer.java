package com.ing.app.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int customerId;
	private String customerClassification;
	private double balance;
	private List<Transaction> transactions;

	public Customer(int customerId, double balance) {
		this.customerId = customerId;
		this.customerClassification = "Not Classified";
		this.balance = balance;
		transactions = new ArrayList<Transaction>();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerClassification() {
		return customerClassification;
	}

	public void setCustomerClassification(String customerClassification) {
		this.customerClassification = customerClassification;
	}

	public double getBalance() {
		return balance;
	}

	public double setBalance(Double balance) {
		return this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
}
