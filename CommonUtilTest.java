package com.boeing.onepdl.inbound.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class CommonUtilTest {

	@InjectMocks
	CommonUtil commonUtil;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		

	}

	@Test
	public void test() throws Exception{
		System.out.println(commonUtil.getCurrentDateInString());
	
	}

}
