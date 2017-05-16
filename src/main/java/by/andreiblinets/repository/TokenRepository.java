package by.andreiblinets.repository;

import by.andreiblinets.entity.TokenUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TokenRepository extends JpaRepository<TokenUser,Long> {

    @Query("SELECT s FROM TokenUser s where s.token = :token")
    TokenUser findByToken(@Param("token") String token);

    @Query("SELECT s FROM TokenUser s where s.user.id = :id")
    TokenUser findByIdUser(@Param("id") long id);
}
