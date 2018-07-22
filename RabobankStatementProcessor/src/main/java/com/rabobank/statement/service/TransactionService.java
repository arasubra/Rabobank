package com.rabobank.statement.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabobank.statement.dto.CustomerRecord;
import com.rabobank.statement.dto.Records;
import com.rabobank.statement.dto.TransactionReport;

public class TransactionService {
	
	private static final Logger logger = LoggerFactory.getLogger(TransactionService.class);
	
	public Map<String,String> getReport(Records records)
	{
		TransactionReport report = new TransactionReport();
		Map<String,String> finalReport = new HashMap<String,String>();
		List<CustomerRecord> list =records.getRecord();
		Set<CustomerRecord> uniqueRecord = new HashSet<CustomerRecord>(list);
		
		try
		{			
			for(CustomerRecord record:uniqueRecord)
			{	
				float endBalance = record.getStartBalance()+(record.getMutation());
				finalReport.put(record.getReference(),record.getDescription());				
				
			}
			
		}
		catch(Exception e)
		{
			logger.error("Error in generating the report{}",e);
		}
		
		return finalReport;
	}

}
