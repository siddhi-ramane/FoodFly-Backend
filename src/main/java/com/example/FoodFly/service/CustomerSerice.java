package com.example.FoodFly.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.FoodFly.Repository.CustomerRepo;

import com.example.FoodFly.enitity.Registration;
import com.example.FoodFly.exception.ResourceNotFoundException;

@Service
public class CustomerSerice {
	
	@Autowired
	public CustomerRepo rs;
	
	@Autowired
	public EmailService es;
	
	@Autowired
	public PasswordEncoder passwordEncoder;

	public Registration registeracc(Registration regis) {
		// TODO Auto-generated method stub
		
		
		String subject = "🍔 Welcome to FoodFly! Your tasty journey begins here";
		String message = "Hi " + regis.getName() + ",\n\n" +
                "Thank you for joining FoodFly! We're excited to have you on board.\n" +
                "Get ready to enjoy delicious meals delivered right to your doorstep.\n\n" +
                "Start exploring our menu and place your first order today! 🛵\n\n" +
                "Happy Eating,\n" +
                "The FoodFly Team";
		
//	    es.sendEmail(regis.getEmail(), subject, message);
	    regis.setIsApproved("1");
	    
	    regis.setPassword(passwordEncoder.encode(regis.getPassword()));
	    return rs.save(regis);
	}

	public Registration loginservice(Registration login) {
		// TODO Auto-generated method stub
		
		 Registration customer = rs.findByEmail(login.getEmail())
		            .orElseThrow(() -> new RuntimeException("Email not found"));

		    System.out.println("Entered Password: " + login.getPassword());
		    System.out.println("Stored Password: " + customer.getPassword());

		    boolean match = passwordEncoder.matches(
		            login.getPassword(),
		            customer.getPassword()
		    );

		    System.out.println("Password Match: " + match);

		    if (!match) {
		        throw new RuntimeException("Invalid Password");
		    }

		    return customer;
			
		
	}

	
	
	

	public void sendotpservice(String email) {
		// TODO Auto-generated method stub
		String code = String.valueOf(new Random().nextInt(900000) + 100000);
		Registration custo = rs.findByEmail(email).orElseThrow(()->new ResourceNotFoundException("Id not Found"));
		es.sendEmail(
		        custo.getEmail(),
		        "Verification Code",
		        "Your code is: " + code
		);
		
	}

	
	
//	public List<CreateCustomerAccount> customerSerice() {
//		
//		return customerrepo.findAll();
//	}

//	public Optional<CreateCustomerAccount> customerSerice(Long id) {
//		// TODO Auto-generated method stub
//		return customerrepo.findById(id);
//	}
//
//
//	public CreateCustomerAccount addCustomerService(CreateCustomerAccount cs) {
//		// TODO Auto-generated method stub
//		
//		return customerrepo.save(cs);
//	}

	
}
