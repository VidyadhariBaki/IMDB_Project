package com.boeing.onepdl.service.contract.service.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.boeing.onepdl.service.contract.controller.ServiceContractConfigController;
import com.boeing.onepdl.service.contract.model.ServiceContractConfigModel;
import com.boeing.onepdl.service.contract.model.ServiceContractConfigModelCriteria;
import com.boeing.onepdl.service.contract.repository.ServiceContractConfigRepository;
import com.boeing.onepdl.service.contract.repository.impl.ServiceContractConfigRepositoryImpl;
import com.boeing.onepdl.service.contract.service.impl.ServiceContractConfigServiceImpl;
import com.boeing.onepdl.service.contract.util.CommonUtil;

public class ServiceContractConfigServiceTest {

	@InjectMocks
	ServiceContractConfigServiceImpl serviceContractConfigServiceImpl = new ServiceContractConfigServiceImpl();
	
	@Mock
	ServiceContractConfigRepositoryImpl serviceContractConfigRepositoryImpl= new ServiceContractConfigRepositoryImpl() ;

	@Mock
	MongoTemplate mongoTemplate;
	

	@Mock
	ServiceContractConfigRepository serviceContractConfigRepository;
	
	//@Mock
	ServiceContractConfigModel serviceContractConfigModel=new ServiceContractConfigModel();
	
    //@Mock
    ServiceContractConfigModelCriteria serviceContractConfigModelCriteria=new ServiceContractConfigModelCriteria();

//	serviceContractConfigModel;
    @Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
	
	
		//serviceContractConfigServiceImpl=new ServiceContractConfigServiceImpl();
	}
	
	@Test
	public void test() throws Exception{
		
		//fail("Not yet implemented");
		serviceContractConfigModel.setBuId("A12");
		serviceContractConfigModel.setCode("ABC");
		serviceContractConfigModel.setContractName("fgfdvg");
		serviceContractConfigModel.setCreatedBy("fgfgdf");
		serviceContractConfigModel.setCreatedDate("2019-08-27");
		serviceContractConfigModel.setInstanceId("tg4");
		serviceContractConfigModel.setLink("http://www.com");
		serviceContractConfigModel.setScId("gt12");
		serviceContractConfigModel.setStatus(55);
		serviceContractConfigModel.setUpdatedBy("bh23");
		serviceContractConfigModel.setUpdatedDate("2019-12-23");
	when(serviceContractConfigRepository.save(serviceContractConfigModel)).thenReturn(serviceContractConfigModel);
	System.out.println(serviceContractConfigServiceImpl.saveServiceContract(serviceContractConfigModel));
	assertThat(serviceContractConfigServiceImpl.saveServiceContract(serviceContractConfigModel), is(notNullValue()));
    
		
	}
	
	@Test
	
	public void Test1() throws Exception{

		//fail("Not yet implemented");
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
	 when(serviceContractConfigRepository.save(serviceContractConfigModel)).thenReturn(serviceContractConfigModel);
	 System.out.println(serviceContractConfigServiceImpl.saveServiceContract(serviceContractConfigModel));
	 assertThat(serviceContractConfigServiceImpl.saveServiceContract(serviceContractConfigModel), is(notNullValue()));
 
		}
	
	@Test
	public void Test2() throws Exception{

		serviceContractConfigServiceImpl=new ServiceContractConfigServiceImpl();
		
        serviceContractConfigModel.setBuId("");
		serviceContractConfigModel.setCode("");
		serviceContractConfigModel.setContractName("");
		serviceContractConfigModel.setCreatedBy("");
	    serviceContractConfigModel.setCreatedDate("");
		serviceContractConfigModel.setInstanceId("");
		serviceContractConfigModel.setLink("");
		serviceContractConfigModel.setScId("");
		serviceContractConfigModel.setStatus(null);
		serviceContractConfigModel.setUpdatedBy("");
		serviceContractConfigModel.setUpdatedDate("");
	when(serviceContractConfigRepository.save(serviceContractConfigModel)).thenReturn(serviceContractConfigModel);
	System.out.println(serviceContractConfigServiceImpl.saveServiceContract(serviceContractConfigModel));
	assertThat(serviceContractConfigServiceImpl.saveServiceContract(serviceContractConfigModel), is(notNullValue()));
    
	}
	
	@Test
	public void Test3() throws Exception
	
	{

		System.out.println(serviceContractConfigServiceImpl.getAllServiceContracts());
		assertThat(serviceContractConfigServiceImpl.getAllServiceContracts(), is(notNullValue()));
	}
	
     @Test
	public void Test4() throws Exception{

		serviceContractConfigServiceImpl=new ServiceContractConfigServiceImpl();
		System.out.println(serviceContractConfigServiceImpl.getAllServiceContracts());
		 assertEquals(serviceContractConfigServiceImpl.getAllServiceContracts(),null);
	}	

	@Test
	
	public void Test5() throws Exception{
		
	serviceContractConfigModelCriteria=new ServiceContractConfigModelCriteria(); 
		
		serviceContractConfigModelCriteria.setBuId("As12");
		serviceContractConfigModelCriteria.setCode("dfvd");
		serviceContractConfigModelCriteria.setContractName("fvgdg");
		serviceContractConfigModelCriteria.setInstanceId("fvs");
		serviceContractConfigModelCriteria.setLink("fgfd");
		serviceContractConfigModelCriteria.setScId("fgfg");
		serviceContractConfigModelCriteria.setStatus(45);
		//serviceContractConfigServiceImpl.getServiceContractsByCriteria(serviceContractConfigModel);
		
		System.out.println("list"+serviceContractConfigServiceImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria));
		assertThat(serviceContractConfigServiceImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria), is(notNullValue()));
	}
	

	@Test
	
	public void Test6() throws Exception{
		
		serviceContractConfigModelCriteria=new ServiceContractConfigModelCriteria();
		serviceContractConfigModelCriteria.setBuId("As12");
		serviceContractConfigModelCriteria.setCode("dfvd");
		serviceContractConfigModelCriteria.setContractName("fvgdg");
		serviceContractConfigModelCriteria.setInstanceId("fvs");
		serviceContractConfigModelCriteria.setLink("fgfd");
		serviceContractConfigModelCriteria.setScId("fgfg");
		serviceContractConfigModelCriteria.setStatus(45);
		serviceContractConfigServiceImpl=new ServiceContractConfigServiceImpl();
		System.out.println("list"+serviceContractConfigServiceImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria));
		assertEquals(serviceContractConfigServiceImpl.getServiceContractsByCriteria(serviceContractConfigModelCriteria), null);
	}
}
