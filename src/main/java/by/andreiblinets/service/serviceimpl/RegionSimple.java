package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.entity.Region;
import by.andreiblinets.repository.RegionRepository;
import by.andreiblinets.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionSimple implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public List<Region> getAll() {
        return null;
    }

    public Region getByID(long id) {
        return null;
    }

    public Region save(Region region) {
        return null;
    }

    public void remove(long id) {

    }
}
