package com.example.taller_universidad.repository;

import com.example.taller_universidad.model.UniversidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UniversidadRepository extends JpaRepository<UniversidadEntity, Long> {
    @Query("select count (uni) from UniversidadEntity uni")
    public Integer countTotalUniversidad();
}
