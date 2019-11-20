
package org.ensa.dao;

import org.ensa.entities.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DaoTransaction implements IDaoTransaction {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void ajouterTransaction(Transaction transaction) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(transaction);

	}

}
