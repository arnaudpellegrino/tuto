package com.miar.tuto.service;

import com.miar.tuto.dto.Message;
import com.miar.tuto.dto.Person;

public interface MessageService {
	
	public Person hello();
	public String postcrypt(final Message message);
	
}
