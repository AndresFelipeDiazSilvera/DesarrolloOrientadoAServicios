package com.example.taller_universidad.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "universidad")
@Setter
@Getter
public class UniversidadEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduniversidad")
    private Long iduniversidad;

    @NotNull
    @Column(name = "nombreuniversidad")
    private String nombreuniversidad;

    @NotNull
    @Column(name = "nituniversidad")
    private String nituniversidad;

    @NotNull
    @Column(name = "nombrepais")
    private String nombrepais;

}
