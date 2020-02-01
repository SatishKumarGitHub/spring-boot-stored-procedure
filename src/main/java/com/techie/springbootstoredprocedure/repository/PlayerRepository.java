package com.techie.springbootstoredprocedure.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techie.springbootstoredprocedure.model.Player;

@Repository
public class PlayerRepository {

	@Autowired
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Player> getPlayers() {
		return em.createNamedStoredProcedureQuery("firstProcedure")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Player> getPlayersByCategory(String category) {
		return em.createNamedStoredProcedureQuery("secondProcedure")
				.setParameter("categeory_name", category).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> getJoinsProcedure() {
		return em.createNamedStoredProcedureQuery("joinProcedure")
				.getResultList();
	}

}
