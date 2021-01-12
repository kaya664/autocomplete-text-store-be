package com.kaya.textstorecontroller.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.datastax.oss.driver.api.core.uuid.Uuids;
import com.kaya.textstorecontroller.entity.Phrase;
import com.kaya.textstorecontroller.repository.PhraseRepository;

public class TextStoreService {
	@Autowired
	PhraseRepository phraseRepository;
	
	public Phrase savePhrase(String phrase) {
		return phraseRepository.save(new Phrase(Uuids.timeBased(), phrase, 1));
	}
}
