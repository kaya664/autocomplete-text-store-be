package com.kaya.textstorecontroller.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.kaya.textstorecontroller.entity.Phrase;

public interface PhraseRepository extends CassandraRepository<Phrase, UUID>{

}
