package com.kaya.textstorecontroller.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaya.textstorecontroller.entity.Phrase;
import com.kaya.textstorecontroller.repository.PhraseRepository;

@Service
public class TextStoreService {
	@Autowired
	PhraseRepository phraseRepository;
	
	public Phrase savePhrase(String phrase) {
		return phraseRepository.save(new Phrase(UUID.randomUUID(), phrase, 1));
	}
}
