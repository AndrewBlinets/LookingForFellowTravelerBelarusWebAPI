package by.andreiblinets.service;

import by.andreiblinets.entity.DateUpdateInformation;

import java.util.List;

public interface DateUpdateService {

    List<DateUpdateInformation> getAll();
    DateUpdateInformation getByID(long id);
    DateUpdateInformation getByLastUpdate();
    DateUpdateInformation save(DateUpdateInformation dateUpdateInformation);
    void remove(long id);
}
