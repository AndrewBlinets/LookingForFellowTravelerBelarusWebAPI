package by.andreiblinets.repository;

import by.andreiblinets.entity.City;
import by.andreiblinets.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface TripRepository extends JpaRepository<Trip,Long>{

    @Query("SELECT s FROM Trip s where s.cityIdOfArrived = :cityIdOfArrived and" +
            " s.cityidOfDeparture = :cityidOfDeparture and s.countFree > 0" +
            " and s.dataOfDeparture = :dataOfDeparture")
    List<Trip> search(@Param("dataOfDeparture") Date dataOfDeparture,
                      @Param("cityidOfDeparture") City cityidOfDeparture,
                      @Param("cityIdOfArrived") City cityIdOfArrived);
}
