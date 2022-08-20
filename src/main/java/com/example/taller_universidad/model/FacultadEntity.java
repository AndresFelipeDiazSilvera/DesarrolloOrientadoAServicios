package com.example.taller_universidad.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "facultad")
@Setter
@Getter
public class FacultadEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfacultad")
    private Long idfacultad;

    @NotNull
    @Column(name = "nombrefacultad")
    private String nombrefacultad;

    @JoinColumn(name = "idseccional", referencedColumnName = "idseccional")
    @ManyToOne(fetch = FetchType.EAGER)
    private SeccionalEntity seccionalEntity;

}
