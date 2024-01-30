package com.shizuka.repo.model;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class Person {

	private Long id;
	private String name;
}