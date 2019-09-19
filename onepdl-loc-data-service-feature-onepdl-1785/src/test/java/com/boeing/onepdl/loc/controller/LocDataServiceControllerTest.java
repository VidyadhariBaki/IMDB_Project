package com.boeing.onepdl.loc.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boeing.onepdl.loc.model.LocDataCriteriaModel;
import com.boeing.onepdl.loc.model.LocDataModel;
import com.boeing.onepdl.loc.service.LocDataService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LocDataServiceControllerTest {

	@InjectMocks
	LocDataServiceController locDataServiceController;
	
	@Mock
	LocDataService locDataService;
	
	LocDataModel locDataModel = new LocDataModel();
	
	LocDataModel locDataModel1 = new LocDataModel();
	
	LocDataCriteriaModel locDataCriteriaModel  =new LocDataCriteriaModel();
	ObjectMapper mapper = new ObjectMapper();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getAlertsByCriteriaTest() throws Exception{
		//fail("Not yet implemented");
		
		locDataCriteriaModel.setBuId("fg12");
		locDataCriteriaModel.setHostLocId("123gsd");
		locDataCriteriaModel.setId("24wc");
		locDataCriteriaModel.setLocActive("fg34");
		locDataCriteriaModel.setScId("hh5");
		locDataCriteriaModel.setStatus(45);
		locDataServiceController.getAlertsByCriteria(locDataCriteriaModel);
		assertThat(locDataServiceController.getAlertsByCriteria(locDataCriteriaModel), is(notNullValue()));
		}
		
	

	@Test
	public void getAlertsByCriteriaExceptionTest() throws Exception{
		//fail("Not yet implemented");
		locDataServiceController=new LocDataServiceController();
		
		locDataCriteriaModel.setBuId("fg12");
		locDataCriteriaModel.setHostLocId("123gsd");
		locDataCriteriaModel.setId("24wc");
		locDataCriteriaModel.setLocActive("fg34");
		locDataCriteriaModel.setScId("hh5");
		locDataCriteriaModel.setStatus(45);
		locDataServiceController.getAlertsByCriteria(locDataCriteriaModel);
		assertThat(locDataServiceController.getAlertsByCriteria(locDataCriteriaModel), is(notNullValue()));
		
	}

	
	@Test
	public void saveLocationDataIterable() throws Exception{
	
		locDataModel.setAc_type("gdh");
		locDataModel.setBuId("dhg");
		locDataModel.setCreatedBy("vidya");
		locDataModel.setCreatedDate("2011-12-12");
		locDataModel.setHostLocId("df12");
		locDataModel.setHostLocTypeId("dg12");
		locDataModel.setHostNetworkId("12s");
		locDataModel.setHostParentLocId("as123");
		locDataModel.setHostProcessGroupId("dgh34");
		locDataModel.setHostRegionId("uiry34");
		locDataModel.setId("ty12");
		locDataModel.setLocActive("jek76");
		locDataModel.setLocDescription("dsfchgj");
		locDataModel.setLocName("gfth56");
		locDataModel.setProcAllowed("ghgfg");
		locDataModel.setRepaAllowed("jhtdgr56");
		locDataModel.setScId("jhgt45");
		locDataModel.setStatus(98);
		locDataModel.setTransStatus(97);
		locDataModel.setUpdatedBy("hjgjkg");
		locDataModel.setUpdatedDate("2017-09-09");
		
		locDataModel1.setAc_type("gdh");
		locDataModel1.setBuId("dhg");
		locDataModel1.setCreatedBy("vidya");
		locDataModel1.setCreatedDate("2011-12-12");
		locDataModel1.setHostLocId("df12");
		locDataModel1.setHostLocTypeId("dg12");
		locDataModel1.setHostNetworkId("12s");
		locDataModel1.setHostParentLocId("as123");
		locDataModel1.setHostProcessGroupId("dgh34");
		locDataModel1.setHostRegionId("uiry34");
		locDataModel1.setId("ty12");
		locDataModel1.setLocActive("jek76");
		locDataModel1.setLocDescription("dsfchgj");
		locDataModel1.setLocName("gfth56");
		locDataModel1.setProcAllowed("ghgfg");
		locDataModel1.setRepaAllowed("jhtdgr56");
		locDataModel1.setScId("jhgt45");
		locDataModel1.setStatus(98);
		locDataModel1.setTransStatus(97);
		locDataModel1.setUpdatedBy("hjgjkg");
		locDataModel1.setUpdatedDate("2017-09-09");
		
		
		
		List<LocDataModel> items = new ArrayList<>();
		items.add(locDataModel);
		items.add(locDataModel1);
		
		
		String jsonString = mapper.writeValueAsString(items);
		//when(locDataRepository.saveAll(items).
				//save(locDataModel)).thenReturn(locDataModel);
		System.out.println(locDataServiceController.saveLocationData(jsonString));
		assertThat(locDataServiceController.saveLocationData(jsonString), is(notNullValue()));
		
		
		}
	
	@Test
	public void saveLocationDataIterableExceptionTest() throws Exception{
		locDataServiceController=new LocDataServiceController();
		
	
	
	
		locDataModel.setAc_type("gdh");
		locDataModel.setBuId("dhg");
		locDataModel.setCreatedBy("vidya");
		locDataModel.setCreatedDate("2011-12-12");
		locDataModel.setHostLocId("df12");
		locDataModel.setHostLocTypeId("dg12");
		locDataModel.setHostNetworkId("12s");
		locDataModel.setHostParentLocId("as123");
		locDataModel.setHostProcessGroupId("dgh34");
		locDataModel.setHostRegionId("uiry34");
		locDataModel.setId("ty12");
		locDataModel.setLocActive("jek76");
		locDataModel.setLocDescription("dsfchgj");
		locDataModel.setLocName("gfth56");
		locDataModel.setProcAllowed("ghgfg");
		locDataModel.setRepaAllowed("jhtdgr56");
		locDataModel.setScId("jhgt45");
		locDataModel.setStatus(98);
		locDataModel.setTransStatus(97);
		locDataModel.setUpdatedBy("hjgjkg");
		locDataModel.setUpdatedDate("2017-09-09");
		
		locDataModel1.setAc_type("gdh");
		locDataModel1.setBuId("dhg");
		locDataModel1.setCreatedBy("vidya");
		locDataModel1.setCreatedDate("2011-12-12");
		locDataModel1.setHostLocId("df12");
		locDataModel1.setHostLocTypeId("dg12");
		locDataModel1.setHostNetworkId("12s");
		locDataModel1.setHostParentLocId("as123");
		locDataModel1.setHostProcessGroupId("dgh34");
		locDataModel1.setHostRegionId("uiry34");
		locDataModel1.setId("ty12");
		locDataModel1.setLocActive("jek76");
		locDataModel1.setLocDescription("dsfchgj");
		locDataModel1.setLocName("gfth56");
		locDataModel1.setProcAllowed("ghgfg");
		locDataModel1.setRepaAllowed("jhtdgr56");
		locDataModel1.setScId("jhgt45");
		locDataModel1.setStatus(98);
		locDataModel1.setTransStatus(97);
		locDataModel1.setUpdatedBy("hjgjkg");
		locDataModel1.setUpdatedDate("2017-09-09");
		
		
		List<LocDataModel> items = new ArrayList<>();
		items.add(locDataModel);
		items.add(locDataModel1);
	
		String jsonString = mapper.writeValueAsString(items);
		//when(locDataRepository.saveAll(items).
				//save(locDataModel)).thenReturn(locDataModel);
		System.out.println(locDataServiceController.saveLocationData(jsonString));
		assertThat(locDataServiceController.saveLocationData(jsonString), is(notNullValue()));
		 
		}
	
	@Test
	public void saveLocationDataFileIterableTest() throws Exception{
		

		String msg="Hello hi ghdcfsdhfgd fgdjvgh fghgklhnjh rtrutymgfvnm ghsdfhsfcj";
		System.out.println(locDataServiceController.saveLocationFileData(msg));
		assertThat(locDataServiceController.saveLocationFileData(msg), is(notNullValue()));
		 
		}
	
	@Test
	public void saveLocationDataFileNullIterableTest() throws Exception
	{
		String msg=null;
		System.out.println(locDataServiceController.saveLocationFileData(msg));
		assertThat(locDataServiceController.saveLocationFileData(msg), is(notNullValue()));
	}
	@Test
	public void saveLocationDataFileIterableExceptionTest() throws Exception{
		locDataServiceController=new LocDataServiceController();
		String msg="Hello hi ghdcfsdhfgd fgdjvgh fghgklhnjh rtrutymgfvnm ghsdfhsfcj";
		System.out.println(locDataServiceController.saveLocationFileData(msg));
		assertThat(locDataServiceController.saveLocationFileData(msg), is(notNullValue()));
		}
	

	@Test
	public void saveLocationDataModelTest() throws Exception
	{
		//locDataModel=new LocDataModel();
		locDataModel.setAc_type("gdh");
		locDataModel.setBuId("dhg");
		locDataModel.setCreatedBy("vidya");
		locDataModel.setCreatedDate("2011-12-12");
		locDataModel.setHostLocId("df12");
		locDataModel.setHostLocTypeId("dg12");
		locDataModel.setHostNetworkId("12s");
		locDataModel.setHostParentLocId("as123");
		locDataModel.setHostProcessGroupId("dgh34");
		locDataModel.setHostRegionId("uiry34");
		locDataModel.setId("ty12");
		locDataModel.setLocActive("jek76");
		locDataModel.setLocDescription("dsfchgj");
		locDataModel.setLocName("gfth56");
		locDataModel.setProcAllowed("ghgfg");
		locDataModel.setRepaAllowed("jhtdgr56");
		locDataModel.setScId("jhgt45");
		locDataModel.setStatus(98);
		locDataModel.setTransStatus(97);
		locDataModel.setUpdatedBy("hjgjkg");
		locDataModel.setUpdatedDate("2017-09-09");
		//when(locDataService.save(locDataModel)).thenReturn(locDataModel);
		System.out.println(locDataServiceController.saveLocationData(locDataModel));
		assertThat(locDataServiceController.saveLocationData(locDataModel), is(notNullValue()));
	}
	@Test
	public void saveLocationDataModelExceptionTest() throws Exception
	{
		locDataServiceController=new LocDataServiceController();
		//locDataModel=new LocDataModel();
		locDataModel.setAc_type("gdh");
		locDataModel.setBuId("dhg");
		locDataModel.setCreatedBy("vidya");
		locDataModel.setCreatedDate("2011-12-12");
		locDataModel.setHostLocId("df12");
		locDataModel.setHostLocTypeId("dg12");
		locDataModel.setHostNetworkId("12s");
		locDataModel.setHostParentLocId("as123");
		locDataModel.setHostProcessGroupId("dgh34");
		locDataModel.setHostRegionId("uiry34");
		locDataModel.setId("ty12");
		locDataModel.setLocActive("jek76");
		locDataModel.setLocDescription("dsfchgj");
		locDataModel.setLocName("gfth56");
		locDataModel.setProcAllowed("ghgfg");
		locDataModel.setRepaAllowed("jhtdgr56");
		locDataModel.setScId("jhgt45");
		locDataModel.setStatus(98);
		locDataModel.setTransStatus(97);
		locDataModel.setUpdatedBy("hjgjkg");
		locDataModel.setUpdatedDate("2017-09-09");
		//when(locDataService.save(locDataModel)).thenReturn(locDataModel);
		locDataServiceController.saveLocationData(locDataModel);
		assertThat(locDataServiceController.saveLocationData(locDataModel), is(notNullValue()));
		
	}
	@Test
	public void getAllLocationDataTest() throws Exception
	{
		locDataServiceController.getAllLocationData();
		assertThat(locDataServiceController.getAllLocationData(), is(notNullValue()));
		
	}
	
	@Test
	public void getAllLocationDataExceptionTest() throws Exception
	{
		locDataServiceController=new LocDataServiceController();
		locDataServiceController.getAllLocationData();
		assertThat(locDataServiceController.getAllLocationData(), is(notNullValue()));
	}
	
	
	
		
	
	
}
