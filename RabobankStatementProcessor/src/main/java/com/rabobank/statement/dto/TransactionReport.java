package com.rabobank.statement.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TransactionReport {
	
	
	private List<CustomerRecord> report;

	public List<CustomerRecord> getReport() {
		return report;
	}

	public void setReport(List<CustomerRecord> report) {
		this.report = report;
	}
	


}
