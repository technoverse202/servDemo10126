package com.rb.sss.preprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.rb.sss.model.EmployeeReq;
import com.rb.core.rest.AssociatedWith;
import com.rb.core.rest.RegisterForDiscovery;
import com.rb.core.rest.RequestPreProcessor;


@RegisterForDiscovery
@AssociatedWith("GetEmployee")
public class GetEmployeePreprocessor implements RequestPreProcessor<EmployeeReq> {
	
	public static final Logger logger = LoggerFactory.getLogger(GetEmployeePreprocessor.class);
	@Override
	public void prepareRequest(EmployeeReq message) {
		
	}

}
