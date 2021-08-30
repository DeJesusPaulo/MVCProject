package com.proyecto.mvc.customval;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodigoValidation implements ConstraintValidator<CodigoPostal, String>{
	
	public String prefijoCodigo;
	
	@Override
    public void initialize(CodigoPostal  codigo) {
		
		prefijoCodigo = codigo.value();
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		boolean valCodigo;
		
		if(arg0 != null) valCodigo= arg0.startsWith(prefijoCodigo);
		
		else valCodigo = true;
		
		
		return valCodigo;
	}

}
