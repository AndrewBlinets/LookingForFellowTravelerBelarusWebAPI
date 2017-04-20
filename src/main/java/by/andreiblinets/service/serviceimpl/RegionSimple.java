package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.DTO.RegionDTO;
import by.andreiblinets.entity.Country;
import by.andreiblinets.entity.Region;
import by.andreiblinets.repository.RegionRepository;
import by.andreiblinets.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionSimple implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public List<RegionDTO> getAll() {
        List<Region> regions = regionRepository.findAll();
        List<RegionDTO> regionDTOs = new ArrayList<RegionDTO>();
        RegionDTO regionDTO = null;
        for (Region obj : regions) {
            regionDTO = new RegionDTO();
            regionDTO.setId(obj.getId());
            regionDTO.setName(obj.getName());
            regionDTO.setIdCountry(obj.getCountry().getId());
            regionDTOs.add(regionDTO);
        }
        return regionDTOs;
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
