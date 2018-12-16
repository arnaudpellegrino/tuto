package com.miar.tuto.business;

import org.springframework.stereotype.Service;

import com.miar.tuto.dto.Message;

@Service
public class CryptBean implements Crypt {

	@Override
	public String crypt(Message message) {
		
		
		
		
		String encryptedMess =  "The message is : " + message.getTextToCrypt() + " - Key : " + message.getKey();
		
		
		
		return encryptedMess;
	}

	@Override
	public String uncrypt(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

}
