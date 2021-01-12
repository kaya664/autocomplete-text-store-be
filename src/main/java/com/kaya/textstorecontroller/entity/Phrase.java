package com.kaya.textstorecontroller.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;

public class Phrase {
	@Id
	private UUID id;

	private String text;
	private int count;

	public Phrase(UUID id, String text, int count) {
		this.id = id;
		this.text = text;
		this.count = count;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
