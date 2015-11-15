package it.eng.test.netflix.firstservice;

import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Model {

	String name;
	String surname;
	Integer age;
	Date birthdate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public static Model random() {
		
		Model model = new Model();
		model.setName(RandomStringUtils.random(30, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		model.setSurname(RandomStringUtils.random(30, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		model.setAge(RandomUtils.nextInt(1, 100));
		model.setBirthdate(new Date(RandomUtils.nextLong(0, Long.MAX_VALUE)));
		
		return model;
	}
}
