package com.example.Mentscape.LoginControlller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	     
	    @GetMapping("")
	    public String viewHomePage() {
	        return "index";
	    }
	
@Autowired
    private LoginService LoginService;
 
     
      public void setloginservice(LoginService LoginService) 
      {
    	 this.LoginService = LoginService;
      }
    @GetMapping("/login")
          
    public ModelAndView login() {
     ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Login());
        return mav;
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("user") Login user ) {
    
     Login oauthUser = LoginService.login(user.getUsername(), user.getEmailid(),user.getPassword());
    
 
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "redirect:/";
    
    
     } else {
     return "redirect:/index";
    
    
     }
 
}
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    
  
        return "redirect:/index";
    }
}
