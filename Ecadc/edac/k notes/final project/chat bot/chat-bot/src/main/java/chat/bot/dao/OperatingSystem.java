package chat.bot.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OS")
public class OperatingSystem {

		@Id
		private int keyid;
		@Column(unique = true)
		private String keyword;
		@Column(columnDefinition="TEXT")
		private String question;
		@Column(columnDefinition="TEXT")
		private String answer;

		@ManyToOne
		private Modules modules;
		
		
		

		public OperatingSystem() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public OperatingSystem( String keyword, String question, String answer, Modules modules) {
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

		public String getKeyword() {
			return keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
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
		
		
		
}
