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
@Table(name = "tbempleado")
@NamedQueries({
    @NamedQuery(name = "Tbempleado.findAll", query = "SELECT t FROM Tbempleado t"),
    @NamedQuery(name = "Tbempleado.findByCodEmp", query = "SELECT t FROM Tbempleado t WHERE t.codEmp = :codEmp"),
    @NamedQuery(name = "Tbempleado.findByNomEmp", query = "SELECT t FROM Tbempleado t WHERE t.nomEmp = :nomEmp"),
    @NamedQuery(name = "Tbempleado.findByApeEmp", query = "SELECT t FROM Tbempleado t WHERE t.apeEmp = :apeEmp"),
    @NamedQuery(name = "Tbempleado.findByLoginEmp", query = "SELECT t FROM Tbempleado t WHERE t.loginEmp = :loginEmp"),
    @NamedQuery(name = "Tbempleado.findByClaveEmp", query = "SELECT t FROM Tbempleado t WHERE t.claveEmp = :claveEmp")})
public class Tbempleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_emp")
    private Integer codEmp;
    @Column(name = "nom_emp")
    private String nomEmp;
    @Column(name = "ape_emp")
    private String apeEmp;
    @Column(name = "login_emp")
    private String loginEmp;
    @Column(name = "clave_emp")
    private String claveEmp;

    public Tbempleado() {
    }

    public Tbempleado(Integer codEmp) {
        this.codEmp = codEmp;
    }

    public Integer getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(Integer codEmp) {
        this.codEmp = codEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getApeEmp() {
        return apeEmp;
    }

    public void setApeEmp(String apeEmp) {
        this.apeEmp = apeEmp;
    }

    public String getLoginEmp() {
        return loginEmp;
    }

    public void setLoginEmp(String loginEmp) {
        this.loginEmp = loginEmp;
    }

    public String getClaveEmp() {
        return claveEmp;
    }

    public void setClaveEmp(String claveEmp) {
        this.claveEmp = claveEmp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEmp != null ? codEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbempleado)) {
            return false;
        }
        Tbempleado other = (Tbempleado) object;
        if ((this.codEmp == null && other.codEmp != null) || (this.codEmp != null && !this.codEmp.equals(other.codEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.utp.jsfejemplo_crud.entidades.Tbempleado[ codEmp=" + codEmp + " ]";
    }
    
}
