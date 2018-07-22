package com.rabobank.statement.dto;

import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="records")
public class Records {
	
	private List<CustomerRecord> record;

	public List<CustomerRecord> getRecord() {
		return record;
	}

	public void setRecord(List<CustomerRecord> record) {
		this.record = record;
	}

	

}
