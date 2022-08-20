package com.example.taller_universidad.rest;

import com.example.taller_universidad.model.DocenteEntity;
import com.example.taller_universidad.model.FacultadEntity;
import com.example.taller_universidad.service.DocenteService;
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
@RequestMapping("/api/docente")
public class DocenteRest {
    @Autowired
    private DocenteService docenteService;

    @GetMapping("")
    private ResponseEntity<List<DocenteEntity>> getAllDocente(){
        return ResponseEntity.ok(docenteService.getAllDocente());
    }

    @GetMapping("{id}")
    private ResponseEntity<Optional<DocenteEntity>> DocenteId(@PathVariable("id") Long id){
        return ResponseEntity.ok(docenteService.getById(id));
    }

    @GetMapping("totaldocente")
    private ResponseEntity<String> getTotalDocente(){
        return ResponseEntity.ok("Total de Docente: " + String.valueOf(docenteService.getTotalDocente()));
    }
}
