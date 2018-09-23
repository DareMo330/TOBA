package tobaserv;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Transaction implements Serializable{
	@ManyToOne
	private Account account;
	
	private Long transactionId;
	private Long accountId;
	private String description;
	private double amount;


	public Transaction(Account account, String description, double amount) {
		accountId = account.getAccountId();
		this.description = description;
		this.amount = amount;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}	