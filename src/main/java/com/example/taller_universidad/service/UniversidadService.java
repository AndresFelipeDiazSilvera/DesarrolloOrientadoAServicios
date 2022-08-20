package com.example.taller_universidad.service;


import com.example.taller_universidad.model.UniversidadEntity;
import com.example.taller_universidad.repository.UniversidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversidadService {

    @Autowired
    private UniversidadRepository universidadRepository;

    public List<UniversidadEntity> getAllUniversidad(){
        return universidadRepository.findAll();
    }

    public Optional<UniversidadEntity> getById(Long id){
        return universidadRepository.findById(id);
    }

    public int getTotalUniversidad(){
        return universidadRepository.countTotalUniversidad();
    }

}
