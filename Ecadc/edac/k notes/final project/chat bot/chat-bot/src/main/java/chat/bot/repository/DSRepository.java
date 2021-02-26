package chat.bot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chat.bot.dao.DataStructure;

public interface DSRepository extends JpaRepository<DataStructure, Integer>{

}
