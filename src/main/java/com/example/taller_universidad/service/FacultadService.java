package com.example.taller_universidad.service;

import com.example.taller_universidad.model.FacultadEntity;
import com.example.taller_universidad.repository.FacultadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultadService {

    @Autowired
    private FacultadRepository facultadRepository;

    public List<FacultadEntity> getAllFacultad(){
        return facultadRepository.findAll();
    }

    public Optional<FacultadEntity> getById(Long id){
        return facultadRepository.findById(id);
    }

    public int getTotalFacultad(){
        return facultadRepository.countTotalFacultad();
    }
}
