package org.ensa.batch;

import java.util.Date;

import org.ensa.dao.IDaoCompte;
import org.ensa.entities.Transaction;
import org.ensa.entities.TransactionContenu;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("transactionProcessor")
public class TransactionProcessor implements ItemProcessor<TransactionContenu, Transaction> {

	@Autowired
	IDaoCompte dao;

	public Transaction process(TransactionContenu tc) throws Exception {

		Transaction t = new Transaction();

		t.setIdTransaction(tc.getIdTransaction());
		t.setMontant(tc.getMontant());
		t.setDateTransaction(tc.getDateTransaction());
		t.setDateDebit(new Date().toString());
		if (dao.findByIdcompte(tc.getIdCompte()) != null) {
			t.setCompte(dao.findByIdcompte(tc.getIdCompte()));
		}
		return t;
	}

}
