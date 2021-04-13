package com.example.demo.mvc;

import javax.validation.Valid;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.List;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmer);
	}

	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult bindingResult,
			Model model) {
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}else {
			CustomerEntity customerEntity = new CustomerEntity(
					theCustomer.getFirstName(),
					theCustomer.getLastName(),
					theCustomer.getFreePasses(),
					theCustomer.getPostalCode(),
					theCustomer.getCourseCode()
			);

			customerRepository.save(customerEntity);

			List<CustomerEntity> customerEntities = customerRepository.findAll();

			model.addAttribute("customersData", customerEntities);

			return "customer-confirmation";
		}
	}
}
