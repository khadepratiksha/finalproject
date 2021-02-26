package chat.bot.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Modules {

	
	@Id
	private int moduleid;
	@Column(nullable = true)
	private String modulename;
	
	@OneToMany(mappedBy = "modules")
	private List<CoreJava> corejava =new ArrayList<>();
	
	@OneToMany(mappedBy = "modules")
	private List<OperatingSystem> OperatingSystem =new ArrayList<>();
	
	@OneToMany(mappedBy = "modules")
	private List<DataStructure> DataStructure =new ArrayList<>();
	
	@OneToMany(mappedBy = "modules")
	private List<Software> Software =new ArrayList<>();
	
	@OneToMany(mappedBy = "modules")
	private List<AdvanceJava> AdvanceJava =new ArrayList<>();
	
	@OneToMany(mappedBy = "modules")
	private List<WebTechnology> WebTechnology =new ArrayList<>();
	
	@OneToMany(mappedBy = "modules")
	private List<DataBase> DataBase =new ArrayList<>();
	
	public Modules() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Modules(int moduleid, String modulename) {
		super();
		this.moduleid = moduleid;
		this.modulename = modulename;
	}
	public int getModuleid() {
		return moduleid;
	}
	public void setModuleid(int moduleid) {
		this.moduleid = moduleid;
	}
	public String getModulename() {
		return modulename;
	}
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
	
	
	
	
}
