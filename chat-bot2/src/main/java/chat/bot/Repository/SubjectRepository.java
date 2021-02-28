package chat.bot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chat.bot.dao.Subject;





public interface SubjectRepository extends JpaRepository<Subject,Integer> {

}
