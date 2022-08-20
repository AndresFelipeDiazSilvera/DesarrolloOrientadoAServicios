package com.example.taller_universidad.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "docente")
@Setter
@Getter
public class DocenteEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddocente")
    private Long idfacultad;

    @NotNull
    @Column(name = "documentodocente")
    private String documentodocente;

    @NotNull
    @Column(name = "nombresdocente")
    private String nombresdocente;

    @NotNull
    @Column(name = "apellidosdocente")
    private String apellidosdocente;

    @NotNull
    @Column(name = "tipodocente")
    private String tipodocente;

    @JoinColumn(name = "idfacultad", referencedColumnName = "idfacultad")
    @ManyToOne(fetch = FetchType.EAGER)
    private FacultadEntity facultadEntity;


}
