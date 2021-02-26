package react.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import react.main.dao.User;
import react.main.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository ur;
	
     @GetMapping("/userdata")
	public String create()
	{
		return "hello";
	}
     
     @CrossOrigin
     @PostMapping("/insertdata")
 	public User create1(@RequestBody User user)
 	{
    	 
 
 	return ur.save(user);
 	}
     
	
}
