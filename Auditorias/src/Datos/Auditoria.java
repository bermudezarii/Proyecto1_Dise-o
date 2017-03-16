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
    private ArrayList<Auditor> auditores = new ArrayList<>();
    private Cliente cliente; 
    private ArrayList<Hallazgo> hallazgos = new ArrayList<>(); 
    private Tipo tipo;
    private Naturaleza naturaleza;
    private Strategy estrategia; 

    public Auditoria(int id, Cliente cliente, Tipo tipo, Naturaleza naturaleza, Strategy estrategia) {
        this.id = id;
        this.cliente = cliente;
        this.tipo = tipo;
        this.naturaleza = naturaleza;
        this.estrategia = estrategia;
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Strategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Strategy estrategia) {
        this.estrategia = estrategia;
    }
    
    
    
    public void registrarHallazgo(Hallazgo nuevo){
    
    }
    
    public String verHallazgos(Auditor solicitante){
        return "todavia falta de hacer (: ";
    }
    
    
    
    
}
