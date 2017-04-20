package by.andreiblinets.repository;

import by.andreiblinets.entity.DateUpdateInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateUpdateRepository extends JpaRepository<DateUpdateInformation, Long> {

}
