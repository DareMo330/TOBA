package tobaserv;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	//create EMF file with persistence unit from persistence.xml
    private static EntityManagerFactory emf = 
    	Persistence.createEntityManagerFactory("tobaPU");
    
	    public static EntityManagerFactory getEmFactory() {
	        if(emf == null) {
	        	try {
	        	emf = Persistence.createEntityManagerFactory("tobaPU");
	        	} catch(Exception e) {
	        		System.out.println(e);
	        	}
	        }
	    	return emf;
	    }
}
