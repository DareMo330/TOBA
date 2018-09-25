package tobaserv;

import java.sql.*;
import java.util.List;

import javax.persistence.*;


public class AccountDB {
	//insert information
	 public static void insert(Account account) {
	        EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        EntityTransaction et = em.getTransaction();
	        et.begin();        
	        try {
	        	//commit account entity to DB
	            em.persist(account);
	            et.commit();
	        } catch (Exception e) {
	        	//if failed cancel commit
	            System.out.println(e);
	            et.rollback();
	        } finally {
	            em.close();
	        }
	    }
	//update information
	 public static void update(Account account) {
	        EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        EntityTransaction et = em.getTransaction();
	        et.begin();       
	        try {
	        	//merge current account entity's changes with it's database entry 
	            em.merge(account);
	            et.commit();
	        } catch (Exception e) {
	        	//if failed cancel commit
	            System.out.println(e);
	            et.rollback();
	        } finally {
	            em.close();
	        }
	    }
	 //add a transaction
	 public static void addTrans(Transaction trans) {
	        EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        EntityTransaction et = em.getTransaction();
	        et.begin();        
	        try {
	        	//commit transaction entity to DB
	            em.persist(trans);
	            et.commit();
	        } catch (Exception e) {
	        	//if failed cancel commit
	            System.out.println(e);
	            et.rollback();
	        } finally {
	            em.close();
	        }
	    }
	 public static List<Transaction> selectTransactions(String accountid) {
		 EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        String qString = "SELECT t FROM Transaction t " +
	                "WHERE t.id = :accountid";
	        TypedQuery<Transaction> q = em.createQuery(qString, Transaction.class);
	        q.setParameter("accountid", accountid);
	        List<Transaction> transactions;
	        try {
	            transactions = q.getResultList();
	            if (transactions == null || transactions.isEmpty())
	                transactions = null;
	        } finally {
	            em.close();
	        }
	        return transactions;
	    }
    }
