package com.cognizant;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.entity.LoginUser;
import com.cognizant.repository.UserRepository;

@SpringBootApplication
public class ECommerceApplication {

	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void initUsers()
	{
		List<LoginUser> users = Stream.of(new LoginUser(101,"admin1","password1","admin@gmail.com")).collect(Collectors.toList());
		
		System.out.println(users);
		
		userRepository.saveAll(users);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

}
