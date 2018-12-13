package com.miar.tuto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miar.tuto.dto.Message;
import com.miar.tuto.dto.Person;
import com.miar.tuto.service.DemoMessageService;
import com.miar.tuto.service.MessageService;

import lombok.NonNull;

@RestController
@RequestMapping("/miar")
class MessageController {

	//@NonNull
	//private MessageService messageService = new DemoMessageService(); //final  // = new DemoMessageService();
	
	@Autowired
	MessageService messageService;
	
	
	@GetMapping("/hello")
	public Person hello() {
		
		return messageService.hello();
		
	}

  //@RequestBody
  @PostMapping("/crypt")
  public String postcrypt( final Message message) {
    return "The message is : " + message.getTextToCrypt() + " - Key : " + message.getKey();
  }

  
  @PostMapping("/uncrypt")
  public String postUncrypt(@RequestBody final Message message) {
    return "Message to uncrypt : " + message.getCrypted() + " !";
  }
  
}
