package com.example.Mentscape.Loginrepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Mentscape.Logindomain.Login;

public interface LoginRepository extends JpaRepository<Login, Long>
{
Login findByUsernameAndPassword(String mentscape_username,String mentscape_Emailid,String mentscape_password);

Optional<Login> findByusername(String username);

void deleteByusername(String username);


 
}


