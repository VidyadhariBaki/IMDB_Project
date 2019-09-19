package com.boeing.onepdl.service.contract.repository.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.boeing.onepdl.service.contract.model.ServiceContractConfigModel;
import com.boeing.onepdl.service.contract.model.ServiceContractConfigModelCriteria;

public class ServiceContractConfigRepositoryImplTest {
	
	@InjectMocks
	ServiceContractConfigRepositoryImpl serviceContractConfigRepositoryImpl;

	@Mock
	MongoTemplate mongoTemplate;
	
	@Mock
	ServiceContractConfigModel serviceContractConfigModel;
	
	@Mock
	ServiceContractConfigModelCriteria serviceContractConfigModelCriteria;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		serviceContractConfigModelCriteria=new ServiceContractConfigModelCriteria(); 
		//serviceContractConfigModel=new ServiceContractConfigModel();
		
		
	}

	@Test
	public void test() throws Exception {
		
		serviceContractConfigModelCriteria.setBuId("As12");
		serviceContractConfigModelCriteria.setCode("dfvd");
		serviceContractConfigModelCriteria.setContractName("fvgdg");
		serviceContractConfigModelCriteria.setInstanceId("fvs");
		serviceContractConfigModelCriteria.setLink("fgfd");
		serviceContractConfigModelCriteria.setScId("fgfg");
		serviceContractConfigModelCriteria.setStatus(45);
		System.out.println(serviceContractConfigRepositoryImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria));
		assertThat(serviceContractConfigRepositoryImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria), is(notNullValue()));
		
	}

	
	@Test
	public void test1() throws Exception {
		
		serviceContractConfigModelCriteria.setBuId("");
		serviceContractConfigModelCriteria.setCode("");
		serviceContractConfigModelCriteria.setContractName("");
		serviceContractConfigModelCriteria.setInstanceId("");
		serviceContractConfigModelCriteria.setLink("");
		serviceContractConfigModelCriteria.setScId("");
		serviceContractConfigModelCriteria.setStatus(null);
		System.out.println(serviceContractConfigRepositoryImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria));
		assertThat(serviceContractConfigRepositoryImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria), is(notNullValue()));
		
		
	}

	@Test
public void test2() throws Exception {
		
		
		serviceContractConfigModelCriteria.setStatus(-34);
		
		System.out.println(serviceContractConfigRepositoryImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria));
		assertThat(serviceContractConfigRepositoryImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria), is(notNullValue()));
		
	}
	   
	@Test
     public void test3() throws Exception {
		

		//serviceContractConfigRepositoryImpl=new ServiceContractConfigRepositoryImpl();
		//fail("Not yet implemented");
		serviceContractConfigModelCriteria=new ServiceContractConfigModelCriteria();
		//serviceContractConfigRepositoryImpl=new ServiceContractConfigRepositoryImpl();
		serviceContractConfigModelCriteria=new ServiceContractConfigModelCriteria();
		serviceContractConfigModelCriteria.setBuId("As12");
		serviceContractConfigModelCriteria.setCode("dfvd");
		serviceContractConfigModelCriteria.setContractName("fvgdg");
		serviceContractConfigModelCriteria.setInstanceId("fvs");
		serviceContractConfigModelCriteria.setLink("fgfd");
		serviceContractConfigModelCriteria.setScId("fgfg");
		serviceContractConfigModelCriteria.setStatus(45);
		serviceContractConfigRepositoryImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria);
		assertThat(serviceContractConfigRepositoryImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria), is(notNullValue()));
		
	}
	
	
}
