package chat.bot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chat.bot.dao.OperatingSystem;

public interface OsRepository extends JpaRepository<OperatingSystem,Integer> {

}
