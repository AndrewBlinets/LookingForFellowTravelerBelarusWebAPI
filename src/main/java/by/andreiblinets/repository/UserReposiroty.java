package by.andreiblinets.repository;

import by.andreiblinets.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposiroty extends JpaRepository<User, Long> {
}
