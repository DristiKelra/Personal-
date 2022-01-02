package com.example.Mentscape.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;

import javax.transaction.Transactional;

import com.example.Mentscape.Logindomain.Login;
import com.example.Mentscape.Loginrepository.LoginRepository;
 
 
 
@Service
@Transactional
public class LoginService {
@Autowired
private LoginRepository repo;
  
public List<Login> listAll() {
    return repo.findAll();
}
 
public void save(Login login) {
    repo.save(login);
}
 
public Login get(Long id) {
    return repo.findById(id).get();
}
 
public void delete(Long id) {
    repo.deleteById(id);
}

public Login get(String username) {
    return repo.findByusername(username).get();
}
 
public void delete(String username) {
    repo.deleteByusername(username);
}


  public Login login(String mentscape_username,String mentscape_Emailid, String mentscape_password) {
  Login user = repo.findByUsernameAndPassword(mentscape_username,mentscape_Emailid,mentscape_password);
   return user;
  }
 
}
