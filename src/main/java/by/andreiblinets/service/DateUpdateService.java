package by.andreiblinets.service;

import by.andreiblinets.entity.LastUpdateInformation;

import java.util.List;

public interface DateUpdateService {

    List<LastUpdateInformation> getAll();
    LastUpdateInformation getByID(long id);
    LastUpdateInformation getByLastUpdate();
    LastUpdateInformation save(LastUpdateInformation lastUpdateInformation);
    void remove(long id);
}
