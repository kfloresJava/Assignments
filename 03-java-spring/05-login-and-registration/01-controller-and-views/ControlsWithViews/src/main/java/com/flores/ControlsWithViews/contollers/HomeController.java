package com.flores.ControlsWithViews.contollers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.flores.ControlsWithViews.models.Users;
import com.flores.ControlsWithViews.services.UserServices;
import com.flores.ControlsWithViews.services.Validator;



@Controller
public class HomeController {
	@Autowired
	private UserServices uServices;
	@Autowired
	private Validator uValidator;

    
    @GetMapping("/registration")
    public String registerForm(@ModelAttribute("user") Users user) {
        return "registration.jsp";
    }
    
    @GetMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @PostMapping("/registration")
    public String registerUser(@Valid @ModelAttribute("user") Users user, BindingResult result, HttpSession session,RedirectAttributes rdAttr) {
    
    	uValidator.validate(user, result);
		if(result.hasErrors())
		{
			return "redirect:/registration";
		}
		Users nUser=this.uServices.registerUser(user);
		session.setAttribute("user___id", nUser.getuID());
		
		return "redirect:/home";
        // if result has errors, return the registration page (don't worry about validations just now)
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
    }
    
    @PostMapping("/login")
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model,RedirectAttributes rdAttr,HttpSession session) {
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
    	if(uServices.authenticateUser(email, password))
		{
			Users nUser=this.uServices.findByuEmail(email);
			session.setAttribute("user___id", nUser.getuID());
			return "redirect:/home";
		}
		rdAttr.addFlashAttribute("error","Invalid Log in details");
		return "redirect:/login";
    }
    
    @GetMapping("/home")
    public String home(HttpSession session, Model vm,RedirectAttributes rdAttr) {
        // get user from session, save them in the model and return the home page
    	if(session.getAttribute("user___id")==null)
		{
			rdAttr.addFlashAttribute("message","Please Login before accessing the dashboard");
			return "redirect:/login";
		} 
		Long uID= (Long)session.getAttribute("user___id");
		
		vm.addAttribute("currUser",this.uServices.getOne(uID));
		return "homePage.jsp";
    	
    }
    @GetMapping("/logout")
    public String logout(HttpSession session,RedirectAttributes rdAttr) {
        // invalidate session
        // redirect to login page
    	
    	rdAttr.addFlashAttribute("message","Successfully Logged Out");
		session.invalidate();
		return "redirect:/login";
    }
}
