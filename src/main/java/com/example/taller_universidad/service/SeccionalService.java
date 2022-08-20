package com.example.taller_universidad.service;

import com.example.taller_universidad.model.SeccionalEntity;
import com.example.taller_universidad.repository.SeccionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeccionalService {

    @Autowired
    private SeccionalRepository seccionalRepository;

    public List<SeccionalEntity> getAllSeccional() {
        return seccionalRepository.findAll();
    }

    public Optional<SeccionalEntity> getById(Long id){
        return seccionalRepository.findById(id);
    }

    public int getTotalSeccional(){
        return seccionalRepository.countTotalSeccional();
    }
}
