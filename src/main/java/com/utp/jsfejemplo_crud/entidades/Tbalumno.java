/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.jsfejemplo_crud.entidades;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author Santiago
 */
@Entity
@Table(name = "tbalumno")
@NamedQueries({
    @NamedQuery(name = "Tbalumno.findAll", query = "SELECT t FROM Tbalumno t"),
    @NamedQuery(name = "Tbalumno.findByIdtbalumno", query = "SELECT t FROM Tbalumno t WHERE t.idtbalumno = :idtbalumno"),
    @NamedQuery(name = "Tbalumno.findByNombre", query = "SELECT t FROM Tbalumno t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tbalumno.findByApellido", query = "SELECT t FROM Tbalumno t WHERE t.apellido = :apellido"),
    @NamedQuery(name = "Tbalumno.findByEdad", query = "SELECT t FROM Tbalumno t WHERE t.edad = :edad")})
public class Tbalumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtbalumno")
    private Integer idtbalumno;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "edad")
    private Integer edad;

    public Tbalumno() {
    }

    public Tbalumno(Integer idtbalumno) {
        this.idtbalumno = idtbalumno;
    }

    public Integer getIdtbalumno() {
        return idtbalumno;
    }

    public void setIdtbalumno(Integer idtbalumno) {
        this.idtbalumno = idtbalumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtbalumno != null ? idtbalumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbalumno)) {
            return false;
        }
        Tbalumno other = (Tbalumno) object;
        if ((this.idtbalumno == null && other.idtbalumno != null) || (this.idtbalumno != null && !this.idtbalumno.equals(other.idtbalumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.utp.jsfejemplo_crud.entidades.Tbalumno[ idtbalumno=" + idtbalumno + " ]";
    }
    
}
