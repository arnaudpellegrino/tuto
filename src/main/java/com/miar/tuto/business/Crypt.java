package com.miar.tuto.business;

import com.miar.tuto.dto.Message;

public interface Crypt {

	public String crypt(Message message);
	public String uncrypt(Message message);
	
}
