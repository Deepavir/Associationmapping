package com.example.BlogApplication.entity;

import jakarta.persistence.Entity;

@Entity(name="CreditAccount")
public class CreditAccount extends Account {
	
	private double creditLimit;

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

}
