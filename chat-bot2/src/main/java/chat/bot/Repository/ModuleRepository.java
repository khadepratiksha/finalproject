package chat.bot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chat.bot.dao.Modules;




public interface ModuleRepository extends JpaRepository<Modules, Integer>{

}
