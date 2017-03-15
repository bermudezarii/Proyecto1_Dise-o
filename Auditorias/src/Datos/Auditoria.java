/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ariana
 */
public class Auditoria {
    private int id; 
    private Date fchinicio; 
    private Date fchfinal; 
    private ArrayList<Auditor> auditores = new ArrayList<>();
    private Cliente cliente; 
    private ArrayList<Hallazgo> hallazgos = new ArrayList<>(); 
    private Tipo tipo;
    private Naturaleza naturaleza;
    //FALTA HACER EL STRATEGY 

    public Auditoria(int id, Date fchinicio, Date fchfinal, Cliente cliente, Tipo tipo, Naturaleza naturaleza) {
        this.id = id;
        this.fchinicio = fchinicio;
        this.fchfinal = fchfinal;
        this.cliente = cliente;
        this.tipo = tipo;
        this.naturaleza = naturaleza;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFchinicio() {
        return fchinicio;
    }

    public void setFchinicio(Date fchinicio) {
        this.fchinicio = fchinicio;
    }

    public Date getFchfinal() {
        return fchfinal;
    }

    public void setFchfinal(Date fchfinal) {
        this.fchfinal = fchfinal;
    }

    public ArrayList<Auditor> getAuditores() {
        return auditores;
    }

    public void setAuditores(ArrayList<Auditor> auditores) {
        this.auditores = auditores;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Naturaleza getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(Naturaleza naturaleza) {
        this.naturaleza = naturaleza;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Hallazgo> getHallazgos() {
        return hallazgos;
    }

    public void setHallazgos(ArrayList<Hallazgo> hallazgos) {
        this.hallazgos = hallazgos;
    }
    
    public void registrarHallazgo(Hallazgo nuevo){
    
    }
    
    public String verHallazgos(Auditor solicitante){
        return "todavia falta de hacer (: ";
    }
    
    
    
    
}
