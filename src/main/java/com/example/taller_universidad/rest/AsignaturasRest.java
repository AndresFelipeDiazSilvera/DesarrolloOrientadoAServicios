package com.example.taller_universidad.rest;

import com.example.taller_universidad.model.AsignaturasEntity;
import com.example.taller_universidad.model.FacultadEntity;
import com.example.taller_universidad.service.AsignaturasService;
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
@RequestMapping("/api/asignatura")
public class AsignaturasRest {
    @Autowired
    private AsignaturasService asignaturasService;

    @GetMapping("")
    private ResponseEntity<List<AsignaturasEntity>> getAllAsignaturas(){
        return ResponseEntity.ok(asignaturasService.getAllAsignaturas());
    }

    @GetMapping("{id}")
    private ResponseEntity<Optional<AsignaturasEntity>> AsignaturaId(@PathVariable("id") Long id){
        return ResponseEntity.ok(asignaturasService.getById(id));
    }

    @GetMapping("totalasignatura")
    private ResponseEntity<String> getTotalAsignaturas(){
        return ResponseEntity.ok("Total de ASignaturas: " + String.valueOf(asignaturasService.getTotalAsignaturas()));
    }
}
