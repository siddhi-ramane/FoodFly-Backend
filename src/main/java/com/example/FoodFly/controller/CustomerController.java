package com.example.FoodFly.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodFly.enitity.Registration;
import com.example.FoodFly.service.CustomerSerice;

@RestController
@RequestMapping("/customerDetails")

public class CustomerController {

	@Autowired
	public CustomerSerice cs;
	
	@PostMapping("/register")
	public ResponseEntity<Registration> register(@RequestBody Registration regis){
		Registration registerperson =  cs.registeracc(regis);
		
		return ResponseEntity.ok(registerperson);
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<Registration> loginConttoller(@RequestBody Registration login ){
		Registration log = cs.loginservice(login);
		
		return ResponseEntity.ok(log);
	}
	
	
	
	
	
	
	
	
	
	@PostMapping("/send-otp")
	public String sendOtp(@RequestBody String email) {
		cs.sendotpservice(email);
	    return "OTP sent";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/get/All")
	
	
	
//	public List<CreateCustomerAccount> getAllCustomers() {
//		
//		return customerservice.customerSerice();
//	}
//	
//	@GetMapping("/get/{id}")
//	public ResponseEntity<CreateCustomerAccount> getCustomerDeatilsByID(@PathVariable Long id){
//		
//		Optional<CreateCustomerAccount> found = customerservice.customerSerice(id);
//		if(found.isPresent()) {
//			return ResponseEntity.ok(found.get());
//		}
//		else {
//			return ResponseEntity.notFound().build();
//					
//		}
//		
			
//	}

	
//	@PostMapping("/add")
//	public ResponseEntity<String> addCustomerDetails(@RequestBody CreateCustomerAccount cs){
//		
//		CreateCustomerAccount savedCustomer = customerservice.addCustomerService(cs);
//		if(savedCustomer!= null) {
//			
//			return ResponseEntity.ok("success");
//		}
//		else {
//			return ResponseEntity.notFound().build();
//		}
//	}
//	
//	
//	
	
	
	
	
}
