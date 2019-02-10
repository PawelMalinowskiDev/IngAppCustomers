package com.ing.app.model;

import java.util.Date;

public class Transaction {

	private String description;
	private double amount;
	private Date timestamp;

	public Transaction(String description, double amount, Date timestamp) {
		this.description = description;
		this.amount = amount;
		this.timestamp = timestamp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
