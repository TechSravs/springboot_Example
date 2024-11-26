package com.example.sravs.Example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sravs.Example.model.User;
import com.example.sravs.Example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@GetMapping("/show")
   public List<User> show(){
		return service.show();
	}
	
	@GetMapping("/showById")
	   public User showById(@RequestParam int id){
			return service.showById(id);
		}
	
	@PutMapping("/update/{id}")
	public User update(@PathVariable int id,@RequestBody User user) {
		return service.update(id,user);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		 return service.delete(id);
		  
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		return service.deleteAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@GetMapping("/users")
//	public List<User> getUsers() {
//		return service.getUsers();
//		
//	}
//	@GetMapping("/users/{userId}")
//	public User getUserById(@PathVariable int userId) {
//		return service.getUserById(userId);
//		
//	}
//	@PostMapping("/users")
//	public void addUser(@RequestBody User user) {
//		service.addUser(user);
//	}

}
