package java_base;

import java.io.Serializable;

public class CompteBancaire implements Serializable {
	private double amount = 0;

	public CompteBancaire(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
