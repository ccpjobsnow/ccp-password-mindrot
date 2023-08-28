package com.ccp.implementations.password.mindrot;

import org.mindrot.jbcrypt.BCrypt;

import com.ccp.especifications.password.CcpPasswordHandler;

class PasswordMindrot implements CcpPasswordHandler {

	@Override
	public boolean matches(String password, String hash) {
		boolean checkpw = BCrypt.checkpw(password, hash);
		return 	checkpw;

	}

	@Override
	public String getPasswordHash(String password) {
		String gensalt = BCrypt.gensalt(12);
		String hashpw = BCrypt.hashpw(gensalt, gensalt);
		return hashpw;

	}
}
