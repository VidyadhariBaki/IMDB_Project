package com.boeing.onepdl.loc.repository.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.boeing.onepdl.loc.model.LocDataCriteriaModel;

public class LocDataRepositoryImplTest {
	
	@InjectMocks
	LocDataRepositoryImpl locDataRepositoryImpl;
	
	@Mock
	MongoTemplate mongoTemplate;
  
	@Mock
	LocDataCriteriaModel locDataCriteriaModel;
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void findByCriteriaTest() throws Exception {
		//fail("Not yet implemented");
		locDataCriteriaModel=new LocDataCriteriaModel();
		locDataCriteriaModel.setBuId("dhgf12");
		locDataCriteriaModel.setHostLocId("hg45");
		locDataCriteriaModel.setId("gdf34");
		locDataCriteriaModel.setLocActive("hjgf23");
		locDataCriteriaModel.setScId("fg45");
		locDataCriteriaModel.setStatus(67);
		locDataRepositoryImpl.findByCriteria(locDataCriteriaModel);
		assertThat(locDataRepositoryImpl.findByCriteria(locDataCriteriaModel), is(notNullValue()));
	}
	
	@Test
	public void findByCriteriaExceptionTest() throws Exception {
		locDataRepositoryImpl=new LocDataRepositoryImpl();
		//fail("Not yet implemented");
		locDataCriteriaModel=new LocDataCriteriaModel();
		locDataCriteriaModel.setBuId("dhgf12");
		locDataCriteriaModel.setHostLocId("hg45");
		locDataCriteriaModel.setId("gdf34");
		locDataCriteriaModel.setLocActive("hjgf23");
		locDataCriteriaModel.setScId("fg45");
		locDataCriteriaModel.setStatus(67);
		locDataRepositoryImpl.findByCriteria(locDataCriteriaModel);
		assertEquals(locDataRepositoryImpl.findByCriteria(locDataCriteriaModel),null);
	}
	@Test
	public void findByCriteriaTest2() throws Exception {
		//fail("Not yet implemented");
		locDataCriteriaModel=new LocDataCriteriaModel();
		locDataCriteriaModel.setBuId("");
		locDataCriteriaModel.setHostLocId("");
		locDataCriteriaModel.setId("");
		locDataCriteriaModel.setLocActive("");
		locDataCriteriaModel.setScId("");
		locDataCriteriaModel.setStatus(null);
		locDataRepositoryImpl.findByCriteria(locDataCriteriaModel);
		assertThat(locDataRepositoryImpl.findByCriteria(locDataCriteriaModel), is(notNullValue()));
	}

	@Test
	public void findByCriteriaTest3() throws Exception {
		//fail("Not yet implemented");
		locDataCriteriaModel=new LocDataCriteriaModel();
		locDataCriteriaModel.setBuId("");
		locDataCriteriaModel.setHostLocId("");
		locDataCriteriaModel.setId("");
		locDataCriteriaModel.setLocActive("");
		locDataCriteriaModel.setScId("");
		locDataCriteriaModel.setStatus(-78);
		locDataRepositoryImpl.findByCriteria(locDataCriteriaModel);
		assertThat(locDataRepositoryImpl.findByCriteria(locDataCriteriaModel), is(notNullValue()));
	}
	
}
