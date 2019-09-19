package com.boeing.onepdl.loc.service.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.boeing.onepdl.loc.model.LocDataCriteriaModel;
import com.boeing.onepdl.loc.model.LocDataModel;
import com.boeing.onepdl.loc.repository.LocDataRepository;
import com.boeing.onepdl.loc.repository.impl.LocDataRepositoryImpl;

public class LocDataServiceImplTest {
	
	@InjectMocks
	LocDataServiceImpl locDataServiceImpl;
	
	@Mock
	   
	LocDataRepositoryImpl locDataRepositoryImpl;

    @Mock
    MongoTemplate mongoTemplate;
    
    
	@Mock
	LocDataRepository locDataRepository;
	
    @Mock
	LocDataModel locDataModel,locDataModel1;

   
    
    @Mock
    LocDataCriteriaModel locDataCriteriaModel=new LocDataCriteriaModel();
    
   
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		locDataModel=new LocDataModel();
	}
	
	@Test
	public void test() throws Exception{
		
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
		when(locDataRepository.save(locDataModel)).thenReturn(locDataModel);
		locDataServiceImpl.saveLocationData(locDataModel);
		assertThat(locDataServiceImpl.saveLocationData(locDataModel), is(notNullValue()));
		 
		}
	
	@Test
	public void test1()  throws Exception {
		locDataServiceImpl=new LocDataServiceImpl();
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
		when(locDataRepository.save(locDataModel)).thenReturn(locDataModel);
		System.out.println(locDataServiceImpl.saveLocationData(locDataModel));
		assertThat(locDataServiceImpl.saveLocationData(locDataModel), is(notNullValue()));
		 
		
		
	}

	@Test
	public void test3() throws Exception {
		locDataServiceImpl=new LocDataServiceImpl();
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
		locDataModel.setId("");
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
		when(locDataRepository.save(locDataModel)).thenReturn(locDataModel);
		System.out.println(locDataServiceImpl.saveLocationData(locDataModel));
		assertThat(locDataServiceImpl.saveLocationData(locDataModel), is(notNullValue()));
		 
		
		
	}
	
	@Test
	public void saveLocationDataTest() throws Exception{
		
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
		when(locDataRepository.save(locDataModel)).thenReturn(locDataModel);
		locDataServiceImpl.saveLocationData(locDataModel);
		assertThat(locDataServiceImpl.saveLocationData(locDataModel), is(notNullValue()));
		 
		}
	@Test
	public void getAllLocationDataTest() throws Exception
			{
		locDataServiceImpl.getAllLocationData();
		assertThat(locDataServiceImpl.getAllLocationData(), is(notNullValue()));
			}
	@Test
	public void getAllLocationDataExceptionTest() throws Exception
			{
		locDataServiceImpl=new LocDataServiceImpl();
		locDataServiceImpl.getAllLocationData();	
		assertEquals(locDataServiceImpl.getAllLocationData(), null);
		
			}
	
	@Test
	public void getLocationDataByCriteriaTest() throws Exception
	{
		locDataCriteriaModel=new LocDataCriteriaModel();
		locDataCriteriaModel.setBuId("dhgf12");
		locDataCriteriaModel.setHostLocId("hg45");
		locDataCriteriaModel.setId("gdf34");
		locDataCriteriaModel.setLocActive("hjgf23");
		locDataCriteriaModel.setScId("fg45");
		locDataCriteriaModel.setScId("rr45");
		locDataCriteriaModel.setStatus(67);
		locDataServiceImpl.getLocationDataByCriteria(locDataCriteriaModel);
		assertThat(locDataServiceImpl.getLocationDataByCriteria(locDataCriteriaModel), is(notNullValue()));
		
	}
	
	@Test
	public void getLocationDataByCriteriaExceptionTest() throws Exception
	{
		locDataServiceImpl=new LocDataServiceImpl();
		locDataCriteriaModel=new LocDataCriteriaModel();
		locDataCriteriaModel.setBuId("dhgf12");
		locDataCriteriaModel.setHostLocId("hg45");
		locDataCriteriaModel.setId("gdf34");
		locDataCriteriaModel.setLocActive("hjgf23");
		locDataCriteriaModel.setScId("fg45");
		locDataCriteriaModel.setScId("rr45");
		locDataCriteriaModel.setStatus(67);
		locDataServiceImpl.getLocationDataByCriteria(locDataCriteriaModel);
		assertEquals(locDataServiceImpl.getLocationDataByCriteria(locDataCriteriaModel), null);
	}
	
	
	

	@Test
	public void saveLocationDataTestIterable() throws Exception{
		
	locDataModel = new LocDataModel();
		
	locDataModel1 = new LocDataModel();
	

	
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
		
		
		
		//when(locDataRepository.saveAll(items).
				//save(locDataModel)).thenReturn(locDataModel);
		System.out.println(locDataServiceImpl.saveLocationData(items));
		assertThat(locDataServiceImpl.saveLocationData(items), is(notNullValue()));
		 
		}
	
	@Test
	public void saveLocationDataTestIterableExceptionTest() throws Exception{
   
	locDataServiceImpl=new LocDataServiceImpl();
	locDataModel = new LocDataModel();
    locDataModel1 = new LocDataModel();
	
	
	
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
	
		
		//when(locDataRepository.saveAll(items).
				//save(locDataModel)).thenReturn(locDataModel);
		System.out.println(locDataServiceImpl.saveLocationData(items));
		assertThat(locDataServiceImpl.saveLocationData(items), is(notNullValue()));
		 
		}
	
			}
	

