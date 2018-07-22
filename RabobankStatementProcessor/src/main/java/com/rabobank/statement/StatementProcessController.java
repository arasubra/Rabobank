package com.rabobank.statement;

import java.io.FileWriter;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.rabobank.statement.dto.CustomerRecord;
import com.rabobank.statement.dto.Records;
import com.rabobank.statement.dto.TransactionReport;
import com.rabobank.statement.service.TransactionService;

/**
 * API controller for processing the statements
 * @author Aravind Subramaniam
 *
 */

@Controller
public class StatementProcessController {
	
	private static final Logger logger = LoggerFactory.getLogger(StatementProcessController.class);
		
	
	@Autowired private TransactionService service;
	
	@RequestMapping(
			value = "/report",
			produces="application/json",
			consumes="application/xml",
			method = RequestMethod.POST
			)
	public @ResponseBody Map<String,String> getReport(@RequestBody String xml)
	{
		Records records = null;
		Map<String,String> report = null;		
		
		logger.info("Inside controller{}",xml);		
		
		try{
			StringReader reader = new StringReader(xml);
			JAXBContext jaxbContext = JAXBContext.newInstance(Records.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			records = (Records) jaxbUnmarshaller.unmarshal(reader);	
			logger.info("Inside controller{}",records.getRecord().get(0).getReference());
			report = service.getReport(records);	
			
		}
		catch(Exception e){
			logger.error("Exception occurred in generating report in controller{}",e);
		}
		
		return report;
		
	}
	@RequestMapping(
			value = "/reportCSV",
			produces={"application/xml","application/json"},
			consumes={"application/xml", "text/csv"},
			method = RequestMethod.POST
			)
	public @ResponseBody TransactionReport getReportCSV(@RequestBody String xml)
	{
		TransactionReport report = new TransactionReport();
		Records records = null;
		
		logger.info("Inside controller");		
		
		try{
			
		}
		catch(Exception e){
			logger.error("Exception occurred in generating report in controller{}",e);
		}
		
		return report;
		
	}
	public void setTemplate(RestTemplate template) {
		// TODO Auto-generated method stub
		
	}


}
