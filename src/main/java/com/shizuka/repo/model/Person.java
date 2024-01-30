package com.shizuka.repo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
@Entity
public class Person {

	@Id
	private Long id;
	private String name;
}