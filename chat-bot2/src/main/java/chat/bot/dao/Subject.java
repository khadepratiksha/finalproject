package chat.bot.dao;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.core.GenericTypeResolver;

@Entity
@Table(name="Subject")
public class Subject {
 
	@Id
	@GeneratedValue
	private int keyid;
	
	private String keyword;
	@Column(columnDefinition="TEXT",nullable = true)
	private String question;
	@Column(columnDefinition="TEXT")
	private String answer;

	@ManyToOne
	private Modules modules;
	
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Subject(String keyword, String question, String answer, Modules modules) {
		super();
		this.keyword = keyword;
		this.question = question;
		this.answer = answer;
		this.modules = modules;
	}


	public int getKeyid() {
		return keyid;
	}
	public void setKeyid(int keyid) {
		this.keyid = keyid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getKeyword() {
		return keyword;
	}


	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Modules getModules() {
		return modules;
	}

	public void setModules(Modules modules) {
		this.modules = modules;
	}
	
	
}
