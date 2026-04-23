package com.example.FoodFly.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.FoodFly.Repository.UserManagementRepo;
import com.example.FoodFly.controller.UserManagementController;
import com.example.FoodFly.dto.UserManagementReqdto;
import com.example.FoodFly.dto.UserManagementResdto;
import com.example.FoodFly.enitity.UserManagement;
import com.example.FoodFly.exception.ResourceNotFoundException;

@Service
public class UserManagementService {

	private final UserManagementRepo usermangmentrepo;
	
	
	
	public UserManagementService(UserManagementRepo usermangmentrepo) {
		this.usermangmentrepo = usermangmentrepo;
	}

	

	public UserManagementResdto getuserservice(Long id) {
		// TODO Auto-generated method stub
		 UserManagement user = usermangmentrepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("404 Data Not Found"));
		
		 return resdto(user);
	}



	private UserManagementResdto resdto(UserManagement user) {
		// TODO Auto-generated method stub
		UserManagementResdto ressdto = new UserManagementResdto();
		ressdto.setFirstName(user.getFirstName());
		ressdto.setLastName(user.getLastName());
		ressdto.setEmail(user.getEmail());
		ressdto.setPhoneNumber(user.getPhoneNumber());
		ressdto.setRole(user.getRole());
		
		
		
		
		return ressdto;
		
		
	}



	public List<UserManagementResdto> getallserviceuser() {
		// TODO Auto-generated method stub
		List<UserManagement> users = usermangmentrepo.findAll();
		if(users.isEmpty()) {
			throw new ResourceNotFoundException("404 Data Not Found"); 
		}
		
		return resdto(users);
	}



	private List<UserManagementResdto> resdto(List<UserManagement> users) {
		// TODO Auto-generated method stub

		
		List<UserManagementResdto> responseList =  new ArrayList<>();
		for(UserManagement user: users) { 
		
		UserManagementResdto ressdto = new UserManagementResdto();	
		ressdto.setFirstName(user.getFirstName());
		ressdto.setLastName(user.getLastName());
		ressdto.setEmail(user.getEmail());
		ressdto.setPhoneNumber(user.getPhoneNumber());
		ressdto.setRole(user.getRole());
		responseList.add(ressdto);
		
		}
		return responseList;
	}



	public UserManagementResdto adduserservice(UserManagementReqdto reqdto) {
		// TODO Auto-generated method stub
				
		UserManagement user = new UserManagement();
		
		user.setFirstName(reqdto.getFirstName());
		user.setLastName(reqdto.getLastName());
		user.setEmail(reqdto.getEmail());
		user.setPhoneNumber(reqdto.getPhoneNumber());
		user.setProfile(reqdto.getProfile());
		user.setPassword(reqdto.getPassword());
		user.setRole("user");
		
		UserManagement saveduser = usermangmentrepo.save(user);
		
		UserManagementResdto ressdto = new UserManagementResdto();
		
		ressdto.setFirstName(saveduser.getFirstName());
		ressdto.setLastName(saveduser.getLastName());
		ressdto.setEmail(saveduser.getEmail());
		ressdto.setPhoneNumber(saveduser.getPhoneNumber());
		ressdto.setRole(saveduser.getRole());
		
		return ressdto;		
	}



	public void deleteuserservice(Long id) {
		// TODO Auto-generated method stub
		UserManagement user = usermangmentrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id not found"));
		
		usermangmentrepo.delete(user);
		
		
	}

	public void deleteallservice() {
		// TODO Auto-generated method stub
		usermangmentrepo.deleteAll();
	}



	public UserManagementResdto userupdateservice(Long id, UserManagementReqdto reqdto) {
		// TODO Auto-generated method stub
		UserManagement idfound = usermangmentrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id not found"));
		
		if(reqdto.getFirstName()!= null) {
			idfound.setFirstName(reqdto.getFirstName());
		}
		
		if(reqdto.getLastName()!= null) {
			idfound.setLastName(reqdto.getLastName());
		}
		if(reqdto.getEmail()!= null) {
			idfound.setEmail(reqdto.getEmail());
		}
		
		if(reqdto.getPhoneNumber()!= null) {
			idfound.setPhoneNumber(reqdto.getPhoneNumber());
		}
		
		if(reqdto.getPassword()!= null) {
			idfound.setPassword(reqdto.getPassword());
		}
		
		if(reqdto.getProfile()!= null) {
			idfound.setProfile(reqdto.getProfile());
		}
		
	    UserManagement updatedUser = usermangmentrepo.save(idfound);
	    return Resdto(updatedUser);
		
	}



	private UserManagementResdto Resdto(UserManagement updatedUser) {
		// TODO Auto-generated method stub
		UserManagementResdto ressdto = new UserManagementResdto();
		ressdto.setFirstName(updatedUser.getFirstName());
		ressdto.setLastName(updatedUser.getLastName());
		ressdto.setEmail(updatedUser.getEmail());
		ressdto.setPhoneNumber(updatedUser.getPhoneNumber());
		ressdto.setProfile(updatedUser.getProfile());
		ressdto.setRole(updatedUser.getRole());
		
		
		return ressdto;
	}

}
