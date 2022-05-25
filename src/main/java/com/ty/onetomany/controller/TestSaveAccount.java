package com.ty.onetomany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.dao.UserAccount;
import com.ty.onetomany.dao.Page;

public class TestSaveAccount {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	
		UserAccount account = new UserAccount();
		account.setEmail("Chetan@mail.com");
		account.setPassword("cheta");
		account.setMobile(9685741023l);
		account.setName("Chetan");
		
		Page page1 = new Page();
		page1.setName("BJP");
		page1.setTitle("The Big Racist Party");
		page1.setDescription("All politians are from Jail");
		
		Page page2 = new Page();
		page2.setName("JDS");
		page2.setTitle("The mini Family Party" );
		page2.setDescription("Its a useless Regional Party but King maker for majority");
		
		entityTransaction.begin();
		entityManager.persist(account);
		entityManager.persist(page1);
		entityManager.persist(page2);
		entityTransaction.commit();
	}
}
