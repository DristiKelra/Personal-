package com.example.Mentscape;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.example.Mentscape.Logindomain.Login;
import com.example.Mentscape.Loginrepository.LoginRepository;


 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LoginRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private LoginRepository repo;
    
    @Test
    public void testCreateUser() {
         Login login= new Login();
       login.setEmailid("2019696@brunel.ac.uk");
        login.setPassword("dri$ti13");
        login.setUsername("Dristi Kelra");
      
         
        Login savedUser = repo.save(login);
         
        Login existUser = entityManager.find(Login.class, savedUser.getId());
         
        assertThat(login.getEmailid()).isEqualTo(existUser.getEmailid());
         
    }
}
