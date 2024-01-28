package com.rb.sss.user.log;

import com.rb.sss.model.EmployeeReq;
import com.rb.sss.model.EmployeeRes;
import com.rb.core.rest.AssociatedWith;
import com.rb.core.rest.RegisterForDiscovery;
import com.rb.integration.user.log.UserLogHandler;
import com.rb.integration.user.log.UserLogRecord;

@RegisterForDiscovery
@AssociatedWith("GetEmployee")
public class GetEmployeeUserLogHandler implements UserLogHandler<EmployeeReq, EmployeeRes> {

	@Override
	public void prepareLogRecord(UserLogRecord record, EmployeeReq req, EmployeeRes resp) {
		
	}

}