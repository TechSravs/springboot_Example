package com.example.sravs.Example.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sravs.Example.model.User;
import com.example.sravs.Example.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo repo;

	public User addUser(User user) {
		 
		return repo.save(user);
	}

	public List<User> show() {
		 
		return repo.findAll();
	}

	public User update(int id,User user) {
		 User user2 = repo.findById(id).get();
		 user2.setName(user.getName());
		 user2.setAge(user.getAge());
		 return repo.save(user2);
		 
	}

	public String delete(int id) {
	   repo.deleteById(id);
	   return "Deleted";
		 
	}

	public String deleteAll() {
		repo.deleteAll();
		return "ALL DELETED";
	}

	public User showById(int id) {
		 
		return repo.findById(id).get();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
////	List<User> users=Arrays.asList(
////			new User(1,"sravani",21),
////			new User(2,"shaiksha",22),
////			new User(3,"vani",21));
////	
//	public List<User> getUsers(){
//		return repo.findAll();
////		return users;
//		
//	}
//
//	public User getUserById(int userId) {
//		return repo.findById(userId).orElse(new User());
////		return users.stream()
////				.filter(u -> u.getId() == userId)
////				.findFirst().get();
////				
//	}
//	public void addUser(User user) {
//		repo.save(user);
////		users.add(user);
//		
//	}

	

}
