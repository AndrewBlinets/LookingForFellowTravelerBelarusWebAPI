package by.andreiblinets.repository;

import by.andreiblinets.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT s FROM User s where s.email = :email and s.hashPassword = :hashPassword")
    User autification(@Param("email") String login,@Param("hashPassword") String hashPassword);

    @Query("SELECT s FROM User s where s.email = :email")
    User checkingEmail(@Param("email") String email);

    @Query("SELECT s FROM User s where s.phone = :phone")
    User checkingPhone(@Param("phone") String phone);
}
