package chat.bot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chat.bot.dao.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
