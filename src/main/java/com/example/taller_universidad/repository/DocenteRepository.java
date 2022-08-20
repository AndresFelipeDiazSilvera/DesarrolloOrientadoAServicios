package com.example.taller_universidad.repository;

import com.example.taller_universidad.model.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DocenteRepository extends JpaRepository<DocenteEntity, Long> {

    @Query("select count (doc) from DocenteEntity doc")
    public Integer countTotalDocente();
}
