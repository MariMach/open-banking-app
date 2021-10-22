package open.banking.contract.entity;

import java.util.Date;


public class Transaction {

	private String type;
	private Date date;
	private Long accountNumber;
	private String currency;
	private Double amount;
	private String merchantName;
	private String merchantLogo;
	
	
	public Transaction() {
		super();
	}
	
	public Transaction(String type, Date date, Long accountNumber, String currency, Double amount,
			String merchantName, String merchantLogo) {
		super();
		this.type = type;
		this.date = date;
		this.accountNumber = accountNumber;
		this.currency = currency;
		this.amount = amount;
		this.merchantName = merchantName;
		this.merchantLogo = merchantLogo;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public String getMerchantName() {
		return merchantName;
	}


	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}


	public String getMerchantLogo() {
		return merchantLogo;
	}


	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}
	
	
	
	
	
	
}
