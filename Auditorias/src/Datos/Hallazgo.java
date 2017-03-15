/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 *
 * @author Arii
 */
public class Hallazgo {
    
    private int id;
    private Date fechaRegistro; 
    private String tipoHallazgo; 
    private String descripcion; 
    private Auditor auditor; 

    public Hallazgo(int id, Date fechaRegistro, String tipoHallazgo, String descripcion, Auditor auditor) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.tipoHallazgo = tipoHallazgo;
        this.descripcion = descripcion;
        this.auditor = auditor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTipoHallazgo() {
        return tipoHallazgo;
    }

    public void setTipoHallazgo(String tipoHallazgo) {
        this.tipoHallazgo = tipoHallazgo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Auditor getAuditor() {
        return auditor;
    }

    public void setAuditor(Auditor auditor) {
        this.auditor = auditor;
    }
    
 
}
