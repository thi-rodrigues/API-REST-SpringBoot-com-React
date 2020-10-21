package com.dev.pesquisa.resources;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dev.pesquisa.entities.Game;

public class Testandoem {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("puname");
	EntityManager em = emf.createEntityManager();
	
	Game ga = new Game();
	
	public void salvar() {
		em.getTransaction().begin();
		
		em.persist(ga);
		em.merge(ga);
		em.remove(ga);
		em.find(Game.class, ga.getId());
		em.createQuery("from Game").getResultList();
		
		em.getTransaction().commit();
		
		em.getTransaction().rollback();
	}
	
	
}
