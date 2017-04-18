package by.andreiblinets.repository;

import by.andreiblinets.entity.City;
import by.andreiblinets.entity.DateUpdateCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DateUpdateRepository extends JpaRepository<DateUpdateCity, Long> {

}
