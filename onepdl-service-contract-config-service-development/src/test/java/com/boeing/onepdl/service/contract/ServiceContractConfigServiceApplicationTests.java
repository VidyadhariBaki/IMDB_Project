package com.boeing.onepdl.service.contract;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceContractConfigServiceApplication.class)
public class ServiceContractConfigServiceApplicationTests {
	


	@Test
	public void contextLoads() {
	}

	@Test
	  public void applicationStarts() {
		ServiceContractConfigServiceApplication.main(new String[] {});
	  }
}


