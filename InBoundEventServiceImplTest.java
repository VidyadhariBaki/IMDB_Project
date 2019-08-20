package com.boeing.onepdl.inbound.service.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import javax.validation.constraints.NotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.boeing.onepdl.inbound.model.InBoundEventModel;
import com.boeing.onepdl.inbound.repository.InBoundEventRepository;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InBoundEventServiceImplTest {
	
	@InjectMocks
	 InBoundEventServiceImpl inBoundEventServiceImpl;
	
	@Mock
	InBoundEventRepository inBoundEventRepository;
	
	InBoundEventModel inBoundEventModel=new InBoundEventModel();
	
	ObjectMapper mapper = new ObjectMapper();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		inBoundEventServiceImpl=new InBoundEventServiceImpl();
		
	}
	
	@Test
	public void InBoundEventModelTest() throws Exception{
		inBoundEventModel.setId("A12");
	    inBoundEventModel.setPayLoad("4h");
//		inBoundEventModel.setCreatedBy("vidya");
		inBoundEventModel.setCreatedDate("2019-08-14");
		inBoundEventModel.setDataSrcType("ABC");
		inBoundEventModel.setDataSrcName("DEF");
//		inBoundEventModel.setBuId("D23");
	    inBoundEventModel.setScId("t68");
	    
	    when(inBoundEventRepository.save(inBoundEventModel)).thenReturn(inBoundEventModel);
        String jsonString = mapper.writeValueAsString(inBoundEventModel);
	   // System.out.println(jsonString);
	   // inBoundEventServiceImpl.process(jsonString);
	    System.out.println(inBoundEventServiceImpl.process(jsonString));
		//assertEquals(inBoundEventServiceImpl.process(jsonString),null);
	    assertThat(inBoundEventServiceImpl.process(jsonString), is(notNullValue()));
		}

	 
}
