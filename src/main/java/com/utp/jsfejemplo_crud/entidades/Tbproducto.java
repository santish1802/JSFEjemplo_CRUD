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
@Table(name = "tbproducto")
@NamedQueries({
    @NamedQuery(name = "Tbproducto.findAll", query = "SELECT t FROM Tbproducto t"),
    @NamedQuery(name = "Tbproducto.findByIdtproducto", query = "SELECT t FROM Tbproducto t WHERE t.idtproducto = :idtproducto"),
    @NamedQuery(name = "Tbproducto.findByNombre", query = "SELECT t FROM Tbproducto t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tbproducto.findByPrecio", query = "SELECT t FROM Tbproducto t WHERE t.precio = :precio"),
    @NamedQuery(name = "Tbproducto.findByStock", query = "SELECT t FROM Tbproducto t WHERE t.stock = :stock")})
public class Tbproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtproducto")
    private Integer idtproducto;
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Column(name = "stock")
    private Integer stock;

    public Tbproducto() {
    }

    public Tbproducto(Integer idtproducto) {
        this.idtproducto = idtproducto;
    }

    public Integer getIdtproducto() {
        return idtproducto;
    }

    public void setIdtproducto(Integer idtproducto) {
        this.idtproducto = idtproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtproducto != null ? idtproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbproducto)) {
            return false;
        }
        Tbproducto other = (Tbproducto) object;
        if ((this.idtproducto == null && other.idtproducto != null) || (this.idtproducto != null && !this.idtproducto.equals(other.idtproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.utp.jsfejemplo_crud.entidades.Tbproducto[ idtproducto=" + idtproducto + " ]";
    }
    
}
