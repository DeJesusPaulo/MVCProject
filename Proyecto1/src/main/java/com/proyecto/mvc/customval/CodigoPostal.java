package com.proyecto.mvc.customval;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CodigoValidation.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CodigoPostal {
	
	public String value() default "30";
	
	public String message() default "Ingresar CP solo perteneciente a Santa Fe";
	
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};

}
