package chat.bot.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chat.bot.dao.User;
import chat.bot.repository.CoreJavaRepository;
import chat.bot.repository.DSRepository;
import chat.bot.repository.ModuleRepository;
import chat.bot.repository.OsRepository;
import chat.bot.repository.SoftwareRepository;
import chat.bot.repository.UserRepository;

@RestController
@RequestMapping("/p1")
public class UserController {

	@Autowired
	UserRepository userrepository;
	
	@Autowired
	ModuleRepository module;
	
	@Autowired
	CoreJavaRepository core;
	
	@Autowired
	OsRepository os;
	
	@Autowired
	SoftwareRepository sw;
	
	@Autowired
	DSRepository ds;
	
	
	
	@PostMapping("/in")
	public User insert(User u) {
		// TODO Auto-generated method stub
		return userrepository.save(u);
		
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id, User user) {
		user.setId(id);
		return userrepository.save(user);
	}

	
	@DeleteMapping("/{id}")
	public boolean deleteUser(@PathVariable int id) {
		userrepository.deleteById(id);
		return true;
	}

	
	@GetMapping("/{id}")
	public User readAll(@PathVariable int id) {

		
	return	userrepository.findById(id).get();
			
	}
	

}
