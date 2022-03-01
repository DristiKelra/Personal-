package com.example.Mentscape.LoginControlller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.Mentscape.LoginService.LoginService;
import com.example.Mentscape.Logindomain.Login;
import com.example.Mentscape.Loginrepository.LoginRepository;


 
@Controller
public class LoginController {
	 @Autowired
	    private LoginRepository LoginRepo;
	     
	    /*@GetMapping("")
	    public String viewHomePage() 
	    {
	        return "Homepagemain";
	    }*/
	    
	    @GetMapping("")
		public String viewLoginpage(Model model) {		
			
			model.addAttribute("login",new Login());
			
			return "LoginPage";
		}
	    
	    /*@GetMapping("/LoginPage")
	    public String ViewLoginPage()
	    {
	    	return "LoginPage";
	    }*/
	
@Autowired
    private LoginService LoginService;
      public void setloginservice(LoginService LoginService) 
      {
    	 this.LoginService = LoginService;
      }
    @GetMapping("/register")
          
    public ModelAndView login() {
     ModelAndView mav = new ModelAndView("login");
        mav.addObject("login", new Login());
        return mav;
    }
      @GetMapping("/LoginPage")
  	public String loginHomePage() {
  		
  		return "Homepagemain";
  		
  	}

    @PostMapping("/process_register")
    public String login(@ModelAttribute("login") Login login ) {
    LoginRepo.save(login);
    return "Homepagemain";
    
    /* Login oauthUser = LoginService.login(login.getUsername(), login.getEmailid(),login.getPassword());
    
 
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "redirect:/Homepagemain";
    
    
     } else {
     return "redirect:/Login";
    
    
     }*/
 
}
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    
  
        return "redirect:/Homepagemain";
    }
}
