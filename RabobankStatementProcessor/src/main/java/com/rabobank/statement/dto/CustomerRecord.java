package com.rabobank.statement.dto;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabobank.statement.service.TransactionService;

import nl.garvelink.iban.IBAN;

@XmlRootElement(name="record")
public class CustomerRecord {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerRecord.class);
	
	private String reference;
	private String accountNumber;
	private String description;
	private float startBalance;
	private float mutation;
	private float endBalance;
	
	

	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getStartBalance() {
		return startBalance;
	}
	public void setStartBalance(float startBalance) {
		this.startBalance = startBalance;
	}
	public float getMutation() {
		return mutation;
	}
	public void setMutation(float mutation) {
		this.mutation = mutation;
	}
	public float getEndBalance() {
		return endBalance;
	}
	public void setEndBalance(float endBalance) {
		this.endBalance = endBalance;
	}
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof CustomerRecord)
		{
			CustomerRecord rec = (CustomerRecord)o;
			if(this.reference == rec.reference)
				return true;
			else
				return false;
		}	
		else{
				return false;
		}
		
	}
	
	@Override
	public int hashCode() {
	    return 2;
	}
	

	
	
	

}
