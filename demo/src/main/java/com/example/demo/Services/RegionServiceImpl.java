package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.example.demo.models.Region;
import com.example.demo.repositories.RegionRepository;

@Service
public class RegionServiceImpl implements RegionService{
    @Autowired
    private RegionRepository regionRepository;

    @Override
    public List<Region> getALL() {
        return regionRepository.findAll();
    }

    @Override
    public Region getById(Integer id) {
        
        return regionRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Region Tidak Ditemukan"));

    }

    @Override
    public Boolean save(Region region) {
        regionRepository.save(region);
        return regionRepository.findById(region.getId()).isPresent();
    }

    @Override
    public Boolean delete(Integer id) {
        regionRepository.deleteById(id);
        return !regionRepository.findById(id).isPresent();
    }
    
}
