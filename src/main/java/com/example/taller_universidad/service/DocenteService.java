package com.example.taller_universidad.service;

import com.example.taller_universidad.model.DocenteEntity;
import com.example.taller_universidad.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public List<DocenteEntity> getAllDocente(){
        return docenteRepository.findAll();
    }

    public Optional<DocenteEntity> getById(Long id){
        return docenteRepository.findById(id);
    }

    public int getTotalDocente(){
        return docenteRepository.countTotalDocente();
    }
}
