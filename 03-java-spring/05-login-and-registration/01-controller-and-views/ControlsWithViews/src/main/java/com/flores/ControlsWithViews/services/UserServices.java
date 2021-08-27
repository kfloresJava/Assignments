package com.flores.ControlsWithViews.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.flores.ControlsWithViews.models.Users;
import com.flores.ControlsWithViews.repository.UserRepository;




@Service
public class UserServices {
	
	private UserRepository uRepo;
	
	public UserServices(UserRepository urepo)
	{
		this.uRepo = urepo;
	}
	
	public List<Users> getAllUsers(){
		return this.uRepo.findAll();
	}
	public Users getOne(Long id)
	{
		return this.uRepo.findById(id).orElse(null);
	}
	
	public Users registerUser(Users user){
		String hash=BCrypt.hashpw(user.getuPass(),BCrypt.gensalt());
		user.setuPass(hash);
		return this.uRepo.save(user);
	}
	 // find user by email
    public Users findByuEmail(String  email) {
        return uRepo.findByuEmail(email);
    }
    
 // find user by id
    public Users findUserById(Long id) {
    	Optional<Users> u = uRepo.findById(id);
    	
    	if(u.isPresent()) {
            return u.get();
    	} else {
    	    return null;
    	}
    }
	
	 public boolean authenticateUser(String email, String password) {
	        // first find the user by email
	        Users user = uRepo.findByuEmail(email);
	        // if we can't find it by email, return false
	        if(user == null) {
	            return false;
	        } else {
	            // if the passwords match, return true, else, return false
	            if(BCrypt.checkpw(password, user.getuPass())) {
	                return true;
	            } else {
	                return false;
	            }
	        }
	 }
	
}
