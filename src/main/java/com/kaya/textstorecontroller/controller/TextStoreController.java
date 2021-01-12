package com.kaya.textstorecontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaya.textstorecontroller.service.TextStoreService;

@RestController
@RequestMapping("/store")
public class TextStoreController {
	
	@Autowired
	TextStoreService textStoreService;
	
	@PostMapping("/text") 
	public void addTextToStore(@RequestParam("text") String text) {
		textStoreService.savePhrase(text);
	}
}
