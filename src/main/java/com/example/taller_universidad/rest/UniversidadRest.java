package com.example.taller_universidad.rest;


import com.example.taller_universidad.model.UniversidadEntity;
import com.example.taller_universidad.service.UniversidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/universidad")
public class UniversidadRest {

    @Autowired
    private UniversidadService universidadService;

    @GetMapping("")
    private ResponseEntity<List<UniversidadEntity>> getAllUniversidad(){
        return ResponseEntity.ok(universidadService.getAllUniversidad());
    }

    @GetMapping("{id}")
    private ResponseEntity<Optional<UniversidadEntity>> UniversidadId(@PathVariable("id") Long id){
        return ResponseEntity.ok(universidadService.getById(id));
    }

    @GetMapping("totaluniversidades")
    private ResponseEntity<String> getTotalUniversidad(){
        return ResponseEntity.ok("Total de Universidades: " + String.valueOf(universidadService.getTotalUniversidad()));
    }



}
