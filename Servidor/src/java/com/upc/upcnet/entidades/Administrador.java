/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upc.upcnet.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author David
 */
@Entity
@Table(name = "Administrador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a"),
    @NamedQuery(name = "Administrador.findByIDAdministrador", query = "SELECT a FROM Administrador a WHERE a.iDAdministrador = :iDAdministrador"),
    @NamedQuery(name = "Administrador.findByPass", query = "SELECT a FROM Administrador a WHERE a.pass = :pass"),
    @NamedQuery(name = "Administrador.findByNombre", query = "SELECT a FROM Administrador a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Administrador.findByApellido", query = "SELECT a FROM Administrador a WHERE a.apellido = :apellido"),
    @NamedQuery(name = "Administrador.findByCorreo", query = "SELECT a FROM Administrador a WHERE a.correo = :correo")})
public class Administrador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "IDAdministrador")
    private String iDAdministrador;
    @Size(max = 30)
    @Column(name = "Pass")
    private String pass;
    @Size(max = 30)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 30)
    @Column(name = "Apellido")
    private String apellido;
    @Size(max = 30)
    @Column(name = "Correo")
    private String correo;

    public Administrador() {
    }

    public Administrador(String iDAdministrador) {
        this.iDAdministrador = iDAdministrador;
    }

    public String getIDAdministrador() {
        return iDAdministrador;
    }

    public void setIDAdministrador(String iDAdministrador) {
        this.iDAdministrador = iDAdministrador;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAdministrador != null ? iDAdministrador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.iDAdministrador == null && other.iDAdministrador != null) || (this.iDAdministrador != null && !this.iDAdministrador.equals(other.iDAdministrador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.upc.upcnet.entidades.Administrador[ iDAdministrador=" + iDAdministrador + " ]";
    }
    
}
