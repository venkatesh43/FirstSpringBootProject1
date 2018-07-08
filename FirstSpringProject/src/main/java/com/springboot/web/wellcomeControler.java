package com.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class wellcomeControler {
	@Autowired
	private wellcomeService service = new wellcomeService();
	
	@RequestMapping("/wellcome")
	public String wellcome() {
		return service.retrieveWellcomeMessage();
		
	}

}

@Component

class wellcomeService{
	public String retrieveWellcomeMessage() {
		return "Good morning boys";
	}
}