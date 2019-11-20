package org.ensa.batch;

import java.util.List;

import org.ensa.dao.IDaoTransaction;
import org.ensa.entities.Transaction;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("transactionWriter")
public class TransactionWriter implements ItemWriter<Transaction> {

	@Autowired
	private IDaoTransaction dao;

	public void write(List<? extends Transaction> t) throws Exception {
		for (Transaction tr : t) {
			dao.ajouterTransaction((Transaction) tr);
		}

	}

}
