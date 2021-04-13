package com.example.demo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	private String prefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		prefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(code == null)
			return true;
		return code.startsWith(prefix);
	}

}
