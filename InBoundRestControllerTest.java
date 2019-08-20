package com.boeing.onepdl.inbound.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.boeing.onepdl.inbound.service.InBoundEventService;

public class InBoundRestControllerTest {
	@InjectMocks
	InBoundRestController inBoundRestController;
	
    @Mock
    InBoundEventService inBoundEventService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
