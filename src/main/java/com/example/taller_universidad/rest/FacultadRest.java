package com.example.taller_universidad.rest;

import com.example.taller_universidad.model.FacultadEntity;
import com.example.taller_universidad.service.FacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/facultad")
public class FacultadRest {

    @Autowired
    private FacultadService facultadService;

    @GetMapping("")
    private ResponseEntity<List<FacultadEntity>> getAllFacultad(){
        return ResponseEntity.ok(facultadService.getAllFacultad());
    }

    @GetMapping("{id}")
    private ResponseEntity<Optional<FacultadEntity>> FacultadId(@PathVariable("id") Long id){
        return ResponseEntity.ok(facultadService.getById(id));
    }

    @GetMapping("totalfacultad")
    private ResponseEntity<String> getTotalFacultad(){
        return ResponseEntity.ok("Total de Facultad: " + String.valueOf(facultadService.getTotalFacultad()));
    }
}
