package it.eng.test.netflix.secondservice;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Model {

	String brand;
	String model;
	Integer year;
	Integer mileage;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public static Model random() {

		Model model = new Model();
		model.setBrand(RandomStringUtils.random(30, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		model.setModel(RandomStringUtils.random(30, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		model.setYear(RandomUtils.nextInt(1950, 2015));
		model.setMileage(RandomUtils.nextInt(0, 300000));

		return model;
	}
}
