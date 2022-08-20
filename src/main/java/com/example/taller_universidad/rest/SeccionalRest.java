package com.example.taller_universidad.rest;

import com.example.taller_universidad.model.SeccionalEntity;
import com.example.taller_universidad.model.UniversidadEntity;
import com.example.taller_universidad.service.SeccionalService;
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
@RequestMapping("/api/seccional")
public class SeccionalRest {

    @Autowired
    private SeccionalService seccionalService;

    @GetMapping("")
    private ResponseEntity<List<SeccionalEntity>> getAllSeccional(){
        return ResponseEntity.ok(seccionalService.getAllSeccional());
    }

    @GetMapping("{id}")
    private ResponseEntity<Optional<SeccionalEntity>> SeccionalId(@PathVariable("id") Long id){
        return ResponseEntity.ok(seccionalService.getById(id));
    }

    @GetMapping("totalseccional")
    private ResponseEntity<String> getTotalSeccional(){
        return ResponseEntity.ok("Total de Seccionales: " + String.valueOf(seccionalService.getTotalSeccional()));
    }

}
