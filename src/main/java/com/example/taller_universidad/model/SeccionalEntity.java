package com.example.taller_universidad.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "seccional")
@Setter
@Getter
public class SeccionalEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseccional")
    private Long idseccional;

    @NotNull
    @Column(name = "direccionseccional")
    private String direccionseccional;

    @NotNull
    @Column(name = "nombreseccional")
    private String nombreseccional;

    @JoinColumn(name = "iduniversidad", referencedColumnName = "iduniversidad")
    @ManyToOne(fetch = FetchType.EAGER)
    private UniversidadEntity universidadEntity;

}
