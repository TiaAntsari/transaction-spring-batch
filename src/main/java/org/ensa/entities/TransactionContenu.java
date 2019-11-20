package org.ensa.entities;

import java.util.Date;

public class TransactionContenu {
	private int idTransaction;
	private int idCompte;
	private double montant;
	private Date dateTransaction;

	public TransactionContenu() {
		super();
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public TransactionContenu(int idTransaction, int idCompte, double montant, Date dateTransaction, String dateDebit) {
		super();
		this.idCompte = idCompte;
		this.idTransaction = idTransaction;
		this.montant = montant;
		this.dateTransaction = dateTransaction;
	}

	public int getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

}
