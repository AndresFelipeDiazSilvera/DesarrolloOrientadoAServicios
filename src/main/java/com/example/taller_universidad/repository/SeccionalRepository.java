package com.example.taller_universidad.repository;

import com.example.taller_universidad.model.SeccionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SeccionalRepository extends JpaRepository<SeccionalEntity, Long> {
    @Query("select count (sec) from SeccionalEntity sec")
    public Integer countTotalSeccional();
}
