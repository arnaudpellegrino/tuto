package com.miar.tuto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miar.tuto.business.CryptBean;
import com.miar.tuto.dto.Message;
import com.miar.tuto.dto.Person;

// final
@Service
public class DemoMessageService implements MessageService {

	@Autowired
	CryptBean crytpbean;
	
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
		return crytpbean.crypt(message);
	}

	
	
}
