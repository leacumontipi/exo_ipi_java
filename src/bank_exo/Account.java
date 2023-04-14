package bank_exo;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private double amount = 0;
	private boolean blocked;
	private double decouvert;

	public Account(String id, double amount, boolean blocked, double decouvert) {
		this.setId(id);
		this.amount = amount;
		this.setBlocked(blocked);
		this.decouvert = decouvert;
	}
	
	public void add(double amount) {
		this.amount += amount;
		System.out.println("Le montant a bien été déposé.");
	}
	
	public boolean lose(double amount) {
		if(amount > this.amount + this.decouvert || this.blocked == true) {
			System.out.println("Vous n'avez pas assez pour retirer de l'argent.");
			return false;
		}
		else {
			this.amount -= amount;
			System.out.println("Le montant a bien été retiré.");
			return true;
		}
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", "
				+ "amount=" + amount + ","
						+ "decouvert=" + decouvert + ","
								+ "blocked=" + blocked + "]";
	}
	
}
