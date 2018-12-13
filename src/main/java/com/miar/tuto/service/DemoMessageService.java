package com.miar.tuto.service;

import org.springframework.stereotype.Service;

import com.miar.tuto.dto.Message;
import com.miar.tuto.dto.Person;

// final
@Service
public class DemoMessageService implements MessageService {

	
	
	public DemoMessageService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Person hello() {
	    final Person person = new Person();
	    person.setFirstname("Bernardo");
	    person.setLastname("SMITH");
	    return person;
	}

	@Override
	public String postcrypt(Message message) {
		return "The message is : " + message.getTextToCrypt() + " - Key : " + message.getKey() + "!";
	}

	
	
}
