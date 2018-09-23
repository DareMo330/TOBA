package tobaserv;

import java.sql.*;
import javax.persistence.*;

public class UserDB {
	//insert information
	 public static void insert(User user) {
	        EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        EntityTransaction et = em.getTransaction();
	        et.begin();        
	        try {
	        	//commit user entity to DB
	            em.persist(user);
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
	 public static void update(User user) {
	        EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        EntityTransaction et = em.getTransaction();
	        et.begin();       
	        try {
	        	//merge current user entity's changes with it's database entry 
	            em.merge(user);
	            et.commit();
	        } catch (Exception e) {
	        	//if failed cancel commit
	            System.out.println(e);
	            et.rollback();
	        } finally {
	            em.close();
	        }
	    }
    }
