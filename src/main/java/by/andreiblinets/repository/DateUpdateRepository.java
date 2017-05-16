package by.andreiblinets.repository;

import by.andreiblinets.entity.LastUpdateInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateUpdateRepository extends JpaRepository<LastUpdateInformation, Long> {

}
