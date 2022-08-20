package com.example.taller_universidad.service;

import com.example.taller_universidad.model.AsignaturasEntity;
import com.example.taller_universidad.repository.AsignaturasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturasService {

    @Autowired
    private AsignaturasRepository asignaturasRepository;

    public List<AsignaturasEntity> getAllAsignaturas(){
        return asignaturasRepository.findAll();
    }

    public Optional<AsignaturasEntity> getById(Long id){
        return asignaturasRepository.findById(id);
    }

    public int getTotalAsignaturas(){
        return asignaturasRepository.countTotalAsignaturas();
    }
}
