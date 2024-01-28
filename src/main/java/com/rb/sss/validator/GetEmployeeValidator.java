package com.rb.sss.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.rb.sss.model.EmployeeReq;
import com.rb.core.rest.AssociatedWith;
import com.rb.core.rest.RegisterForDiscovery;
import com.rb.core.validators.RequestValidator;


@RegisterForDiscovery
@AssociatedWith("GetEmployee")
public class GetEmployeeValidator implements RequestValidator<EmployeeReq> {

	public static final Logger logger = LoggerFactory.getLogger(GetEmployeeValidator.class);

	@Override
	public void validate(EmployeeReq message) {
		
	}

}
