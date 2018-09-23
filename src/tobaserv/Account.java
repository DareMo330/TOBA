package tobaserv;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Account implements Serializable {
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Transaction> transactions;
	
	private Long accountId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String email;
	private String username;
	private String password;
	private double balance;
	private User user;

	// make account from user, add balance
	public Account(User user, double balance) {
		
		
		firstName = user.getFirstName();
		lastName = user.getLastName();
		phone = user.getPhone();
		address = user.getAddress();
		city = user.getCity();
		state = user.getState();
		zipcode = user.getZipcode();
		email = user.getEmail();
		username = user.getUsername();
		password = user.getPassword();
		this.balance = balance;
		this.user = user;
	}

	// credit method, adds balance
	public void credit(double amount) {
		balance += amount;
	}

	// debit method, removes balance
	public void debit(double amount) {
		balance -= amount;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

}
