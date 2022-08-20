package com.example.taller_universidad.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "asignaturas")
@Setter
@Getter
public class AsignaturasEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idasignatura")
    private Long idasignatura;

    @NotNull
    @Column(name = "semestreasignatura")
    private String semestreasignatura;

    @NotNull
    @Column(name = "nombreasignatura")
    private String nombreasignatura;

    @NotNull
    @Column(name = "codigoasignatura")
    private String codigoasignatura;

    @NotNull
    @Column(name = "tipoasignatura")
    private String tipoasignatura;

    @JoinColumn(name = "iddocente", referencedColumnName = "iddocente")
    @ManyToOne(fetch = FetchType.EAGER)
    private DocenteEntity docenteEntity;
}
