package org.ensa.dao;

import org.ensa.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDaoCompte extends JpaRepository<Compte, Integer> {
	public Compte findByIdcompte(int id);
}
