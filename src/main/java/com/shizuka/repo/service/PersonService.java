package com.shizuka.repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shizuka.repo.model.Person;


@Service
public class PersonService {

	@Autowired
	public Person getPerson() {
		return Person.builder().name("beu").build();
	}
}
