package com.example.taller_universidad.repository;

import com.example.taller_universidad.model.FacultadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FacultadRepository extends JpaRepository<FacultadEntity, Long> {

    @Query("select count (fac) from FacultadEntity fac")
    public Integer countTotalFacultad();
}
