package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test
	public void createCustomer () {
		Reporter.log("createcustomer", true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deletecustomer", true);
	}
	}
