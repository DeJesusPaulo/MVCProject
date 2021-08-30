package com.proyecto.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.proyecto.mvc.customval.CodigoPostal;

public class Usuario {
	
	@NotNull
	@Size(min=5, message = "Campo requerido")
	private String name;
	@NotNull
	@Size(min=5, message = "Campo requerido")
	private String surname;
	private String category;
	private String workingDay;
	@Email
	private String email;
	// @Pattern(regexp = "[0-9]{4}", message = "Incorrecto, solo 4 digitos")
	@CodigoPostal
	private String postalcode;
	@Min(value = 18, message = "Mayores de edad unicamente")
	@Max(value = 65, message = "Supera la edad permitida")
	private int age;
	
	
	
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getWorkingDay() {
		return workingDay;
	}
	public void setWorkingDay(String workingDay) {
		this.workingDay = workingDay;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
