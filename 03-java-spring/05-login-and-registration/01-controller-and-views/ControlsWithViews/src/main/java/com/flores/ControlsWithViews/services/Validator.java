package com.flores.ControlsWithViews.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.flores.ControlsWithViews.models.Users;
import com.flores.ControlsWithViews.repository.UserRepository;

@Component
public class Validator {

	@Autowired
	private UserRepository uRepo;
	
	public boolean supports(Class<?> clazz)
	{
		return Users.class.equals(clazz);
	}
	
	public void validate(Object targs, Errors errors)
	{
		Users user= (Users) targs;
		
		if(!user.getuPass().equals(user.getuPass2()))
		{
			 errors.rejectValue("uPassword", "Match", "Passwords does not match");
		}
		if(uRepo.existsByuEmail(user.getuEmail()))
		{
			 errors.rejectValue("uEmail", "Unique", "Email Already used, try a different email");
		}
	}
	
}
