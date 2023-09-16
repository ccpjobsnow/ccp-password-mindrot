package com.ccp.implementations.password.mindrot;

import com.ccp.dependency.injection.CcpInstanceProvider;

public class CcpMindrotPasswordHandler implements CcpInstanceProvider {

	@Override
	public Object getInstance() {
		return new MindrotPasswordHandler();
	}

}
