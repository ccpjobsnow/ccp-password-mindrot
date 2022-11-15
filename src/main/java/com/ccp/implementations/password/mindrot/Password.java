package com.ccp.implementations.password.mindrot;

import com.ccp.dependency.injection.CcpModuleExporter;

public class Password implements CcpModuleExporter {

	@Override
	public Object export() {
		return new PasswordMindrot();
	}

}
