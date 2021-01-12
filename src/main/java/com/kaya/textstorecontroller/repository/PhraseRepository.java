package com.kaya.textstorecontroller.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kaya.textstorecontroller.entity.Phrase;

public interface PhraseRepository extends MongoRepository<Phrase, UUID>{

}
