package com.example.taller_universidad.repository;

import com.example.taller_universidad.model.AsignaturasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AsignaturasRepository extends JpaRepository<AsignaturasEntity, Long> {

    @Query("select count (asig) from AsignaturasEntity asig")
    public Integer countTotalAsignaturas();
}
