package com.boeing.onepdl.service.contract.controller;


import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.boeing.onepdl.service.contract.model.ServiceContractConfigModel;
import com.boeing.onepdl.service.contract.model.ServiceContractConfigModelCriteria;
import com.boeing.onepdl.service.contract.repository.ServiceContractConfigRepository;
import com.boeing.onepdl.service.contract.repository.impl.ServiceContractConfigRepositoryImpl;
import com.boeing.onepdl.service.contract.service.impl.ServiceContractConfigServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(value=ServiceContractConfigController.class,secure=false)
public class ServiceContractConfigControllerTest {
	
	@InjectMocks
	ServiceContractConfigController serviceContractConfigController=new ServiceContractConfigController();
	
	@Mock
	ServiceContractConfigController service;
	
	@Mock
	ServiceContractConfigRepositoryImpl serviceContractConfigRepositoryImpl;
	
	@Mock
	ServiceContractConfigServiceImpl ServiceContractConfigServiceImpl;
	
	@Autowired
	private MockMvc mockMvc;
	 
	
	ObjectMapper mapper = new ObjectMapper();
	ServiceContractConfigModelCriteria serviceContractConfigModelCriteria=new ServiceContractConfigModelCriteria();
	ServiceContractConfigModel serviceContractConfigModel=new ServiceContractConfigModel();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	
		this.mockMvc = MockMvcBuilders.standaloneSetup(serviceContractConfigController).build();
	}

	
//	
	@Test
	public void getAllServiceContractsTest() throws Exception {
		
	
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/api-service/serviceContract/v1/all").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
				System.out.println(serviceContractConfigController.getAllServiceContracts());
		}
	@Test
	public void getAllServiceContractsExceptionTest() throws Exception {
		 serviceContractConfigController=new ServiceContractConfigController();
		
	serviceContractConfigController.getAllServiceContracts();
		//MvcResult result = 
				//mockMvc.perform(MockMvcRequestBuilders.get("/api-service/serviceContract/v1/criteria").accept(MediaType.APPLICATION_JSON)).andExpect(status().isBadRequest());
		
		}
	

	@Test
	public void getServiceContractsByCriteriaExceptionTest() throws Exception
	{
		 serviceContractConfigController=new ServiceContractConfigController();
		serviceContractConfigModelCriteria =new ServiceContractConfigModelCriteria();
		serviceContractConfigModelCriteria.setBuId("As12");
		serviceContractConfigModelCriteria.setCode("dfvd");
		serviceContractConfigModelCriteria.setContractName("fvgdg");
		serviceContractConfigModelCriteria.setInstanceId("fvs");
		serviceContractConfigModelCriteria.setLink("fgfd");
		serviceContractConfigModelCriteria.setScId("fgfg");
		serviceContractConfigModelCriteria.setStatus(45);
		serviceContractConfigController.getServiceContractsByCriteria(serviceContractConfigModelCriteria);
		
	}
	@Test
	public void getServiceContractsByCriteriaTest() throws Exception
	{
		// serviceContractConfigController=new ServiceContractConfigController();
		serviceContractConfigModelCriteria =new ServiceContractConfigModelCriteria();
		serviceContractConfigModelCriteria.setBuId("As12");
		serviceContractConfigModelCriteria.setCode("dfvd");
		serviceContractConfigModelCriteria.setContractName("fvgdg");
		serviceContractConfigModelCriteria.setInstanceId("fvs");
		serviceContractConfigModelCriteria.setLink("fgfd");
		serviceContractConfigModelCriteria.setScId("fgfg");
		serviceContractConfigModelCriteria.setStatus(45);
		System.out.println(serviceContractConfigController.getServiceContractsByCriteria(serviceContractConfigModelCriteria));

		
	}
	@Test
	public void saveReasonCodeExceptionTest() throws Exception
	{
		serviceContractConfigController=new ServiceContractConfigController();
		serviceContractConfigModel=new ServiceContractConfigModel();
		serviceContractConfigModel.setBuId("A12");
		serviceContractConfigModel.setCode("ABC");
		serviceContractConfigModel.setContractName("fgfdvg");
		serviceContractConfigModel.setCreatedBy("fgfgdf");
		serviceContractConfigModel.setCreatedDate("2015-08-27");
		serviceContractConfigModel.setInstanceId("tg4");
		serviceContractConfigModel.setLink("http://www.com");
		serviceContractConfigModel.setScId("");
		serviceContractConfigModel.setStatus(55);
		serviceContractConfigModel.setUpdatedBy("bh23");
		serviceContractConfigModel.setUpdatedDate("2019-12-23");
		String jsonString = mapper.writeValueAsString(serviceContractConfigModel);
	//	System.out.println(jsonString);
	
		
		serviceContractConfigController.saveReasonCode(serviceContractConfigModel);
		   
	
		
	}
	@Test
	public void saveReasonCodeTest() throws Exception
	{
		//serviceContractConfigModel=new ServiceContractConfigModel();
		
		serviceContractConfigModel.setBuId("A12");
		serviceContractConfigModel.setCode("ABC");
		serviceContractConfigModel.setContractName("fgfdvg");
		serviceContractConfigModel.setCreatedBy("fgfgdf");
		serviceContractConfigModel.setCreatedDate("2015-08-27");
		serviceContractConfigModel.setInstanceId("tg4");
		serviceContractConfigModel.setLink("http://www.com");
		serviceContractConfigModel.setScId("");
		serviceContractConfigModel.setStatus(55);
		serviceContractConfigModel.setUpdatedBy("bh23");
		serviceContractConfigModel.setUpdatedDate("2019-12-23");
		String jsonString = mapper.writeValueAsString(serviceContractConfigModel);
	//	System.out.println(jsonString);
     System.out.println( serviceContractConfigController.saveReasonCode(serviceContractConfigModel));
       		 
}
		
	}

