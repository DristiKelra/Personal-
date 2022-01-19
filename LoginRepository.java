package com.example.Mentscape.Loginrepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Mentscape.Logindomain.Login;

public interface LoginRepository extends JpaRepository<Login, Long>
{
	Login findByUsernameAndPassword(String Username,String Password);

	Optional<Login> findByUsername(String Username);

	void deleteByUsername(String Username);
	
	void deleteById (Long id);
	




 
}


