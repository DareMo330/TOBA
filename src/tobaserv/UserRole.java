package tobaserv;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class UserRole implements Serializable{


         @Id
	private String username;
         @Id
	private String role;
    
	public UserRole(User user, String role) {
		username = user.getUsername();
		this.role=role;
	}
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
}	