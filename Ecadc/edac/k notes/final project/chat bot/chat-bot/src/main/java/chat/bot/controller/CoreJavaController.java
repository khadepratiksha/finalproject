package chat.bot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import chat.bot.dao.CoreJava;
import chat.bot.dao.Modules;
import chat.bot.repository.CoreJavaRepository;
import chat.bot.repository.ModuleRepository;
import chat.bot.repository.UserRepository;

@RestController
@RequestMapping("/core")
public class CoreJavaController {

	@Autowired
	UserRepository userrepository;
	
	@Autowired
	ModuleRepository module;
	
	@Autowired
	CoreJavaRepository core;
	
	

	@PostMapping("/module")
	public Modules insert1(Modules m) {
		// TODO Auto-generated method stub
		return module.save(m);
		
	}
	
	
	@PostMapping("/corejava")
	public CoreJava insert() {
		// TODO Auto-generated method stub
		CoreJava c=new CoreJava("if else", "if else","public class IfExample {  public static void main(String[] args) {  int age=20;  if(age>18){   System.out.print('Age is greater than 18');  }  }  }  ", null);
		
		return core.save(c);
		
	}
	
	

	@GetMapping("/{id}")
	public List<CoreJava> readAll(@PathVariable int id) {

		
	return	core.findAll();
			
	}
	
	 @GetMapping("/demo")  
	public ModelAndView demo(HttpServletRequest request) {
		 
		 CoreJava c=new CoreJava();
		 ModelAndView mv = new ModelAndView();
		 c.setKeyid(2);
		 c.setAnswer(request.getParameter("ans"));
		 c.setQuestion(request.getParameter("que"));
		 core.save(c);
		 mv.setViewName("demopage");
		return mv;
	
		 
	     	
	}
}
