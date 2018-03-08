package com.jpa.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {

	@Id
	@GeneratedValue
	private Long id;
	private String number;

	protected Passport() {
	}

	public Passport(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return String.format("Passaport [number=%s]", number);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
