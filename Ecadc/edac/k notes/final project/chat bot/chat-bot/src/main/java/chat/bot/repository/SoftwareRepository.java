package chat.bot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chat.bot.dao.Software;

public interface SoftwareRepository extends JpaRepository<Software, Integer> {

}
