package chat.bot.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Test {

	@Id

	private int testid;
	private String keyword;

	@ManyToOne
	private Modules modules;

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(String keyword, Modules modules) {
		super();
		this.keyword = keyword;
		this.modules = modules;
	}

	public int getTestid() {
		return testid;
	}

	public void setTestid(int testid) {
		this.testid = testid;
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
