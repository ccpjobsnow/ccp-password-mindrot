package com.ccp.implementations.password.mindrot;

import org.mindrot.jbcrypt.BCrypt;

import com.ccp.especifications.password.CcpPasswordHandler;

class PasswordMindrot implements CcpPasswordHandler {

	@Override
	public boolean matches(String hash, String password) {
		boolean checkpw = BCrypt.checkpw(hash, password);
		return 	checkpw;

	}

	@Override
	public String getPasswordHash(String password) {
		String gensalt = BCrypt.gensalt(12);
		String hashpw = BCrypt.hashpw(gensalt, gensalt);
		return hashpw;

	}
}
