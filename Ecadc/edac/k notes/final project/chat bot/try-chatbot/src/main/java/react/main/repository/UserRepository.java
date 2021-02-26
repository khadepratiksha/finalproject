package react.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import react.main.dao.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
