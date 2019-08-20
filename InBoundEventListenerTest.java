package com.boeing.onepdl.inbound.listener;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boeing.onepdl.inbound.model.InBoundEventModel;
import com.boeing.onepdl.inbound.service.InBoundEventService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.internal.function.text.Length;

public class InBoundEventListenerTest {
	InBoundEventModel inBoundEventModel=new InBoundEventModel();
	@InjectMocks
	InBoundEventListener inBoundEventListener;
	@Mock
	InBoundEventService inBoundEventService;
	ObjectMapper mapper = new ObjectMapper();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		InBoundEventListener inBoundEventListener=new InBoundEventListener();
	}

	@Test
	public void test() throws Exception {
	//	InBoundEventService inBoundEventService = mock(InBoundEventService.class);
		//InBoundEventListener mock =PowerMockito.mock(InBoundEventListener.class);
		inBoundEventModel.setBuId("g45");
		inBoundEventModel.setCreatedBy("vidya");
		inBoundEventModel.setCreatedDate("2019-08-16");
		inBoundEventModel.setDataSrcName("Abc");
		inBoundEventModel.setDataSrcType("hjd");
		inBoundEventModel.setId("123");
		inBoundEventModel.setPayLoad("34");
		inBoundEventModel.setScId("54ss");
		String jsonString = mapper.writeValueAsString(inBoundEventModel);
	    inBoundEventListener.processMessage(jsonString);
	   
		
		
	}

}
