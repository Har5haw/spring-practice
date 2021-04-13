package com.example.demo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.example.demo.mvc.validation.CourseCode;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {

	@NonNull
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min = 4, message="min 4 characters")
	@NonNull
	private String lastName;
	
	@NotNull(message="is required")
	@Max(value = 10, message="should be less than 10")
	@Min(value = 0 , message="should be greater than 0")
	@NonNull
	private Integer freePasses;

	@NotNull(message="is required")
	@Pattern(regexp="^[0-9]{6}", message = "only 6 chars/digits")
	@NonNull
	private String postalCode;
	
	@NotNull(message = "is required")
	@CourseCode
	@NonNull
	private String courseCode;
}
