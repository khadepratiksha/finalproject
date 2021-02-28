package chat.bot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import chat.bot.Repository.ModuleRepository;
import chat.bot.Repository.SubjectRepository;
import chat.bot.dao.Modules;
import chat.bot.dao.Subject;





@RestController
@RequestMapping("/core")
public class SubjectController {

	
	@Autowired
	SubjectRepository core;
	
	@Autowired
	ModuleRepository module;
	
	

	@PostMapping("/module")
	public Modules insert1(Modules m) {
		// TODO Auto-generated method stub
		return module.save(m);
		
	}
	
	
	@PostMapping("/corejava")
	public Subject insert() {
		// TODO Auto-generated method stub
		Subject c=new Subject("if else", "if else","public class IfExample {  public static void main(String[] args) {  int age=20;  if(age>18){   System.out.print('Age is greater than 18');  }  }  }  ", null);
		
		return core.save(c);
		
	}
	
	
	@CrossOrigin
	@GetMapping("/data")
	public List<Subject> readAll() {

		
	return	core.findAll();
			
	}
	
	
	 @GetMapping("/demo")  
	public ModelAndView demo(HttpServletRequest request) {
		 
		 Subject c=new Subject();
		 ModelAndView mv = new ModelAndView();
		 c.setKeyid(2);
		 c.setAnswer(request.getParameter("ans"));
		 c.setQuestion(request.getParameter("que"));
		 core.save(c);
		 mv.setViewName("demopage");
		return mv;
	
		 
	     	
	}
	 
	 @CrossOrigin
     @PostMapping("/insertdata")
 	public User create1(@RequestBody User user)
 	{
    	 
 
 	return ur.save(user);
 	}
}
