package com.example.demo.entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Imagen {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    // atributo que asigna el formato del archivo de la imagen
    private String mime;

    private String nombre;

    // arreglo de bytes donde se guardará
    // con Lob le decimos que es pesado
    // con basic le decimos que el tipo de carga es perezosa
    // (se cargará sólo cuando se pida)
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] contenido;

}
