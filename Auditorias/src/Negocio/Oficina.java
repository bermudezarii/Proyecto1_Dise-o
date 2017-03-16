/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Auditor;
import Datos.Auditoria;
import Datos.Cliente;
import Datos.Naturaleza;
import Datos.Tipo;
import java.util.Date;

/**
 *
 * @author Arii
 */
public class Oficina {
    private int id; 
    private int telefono; 
    private String correo; 
    private GestorCliente cartera; 
    private GestorContrato contratos; 
    private GestorAuditoria auditorias; 
    private GestorAuditor auditores; 

    public Oficina(int id, int telefono, String correo, GestorCliente cartera, GestorContrato contratos, GestorAuditoria auditorias, GestorAuditor auditores) {
        this.id = id;
        this.telefono = telefono;
        this.correo = correo;
        this.cartera = cartera;
        this.contratos = contratos;
        this.auditorias = auditorias;
        this.auditores = auditores;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public boolean crearContrato(Cliente pCliente, Auditor pAuditor, Date desde, Date hasta, Tipo pTipo, Naturaleza pNaturaleza){
        // def 
        return true; 
    }
    
    public boolean agregarCliente(DTOCliente info){
        //def 
        return true; 
    }
    
    public boolean modificarCliente(DTOCliente info){
        //def
        return true; 
    }

    public GestorCliente getCartera() {
        return cartera;
    }

    public void setCartera(GestorCliente cartera) {
        this.cartera = cartera;
    }

    public GestorContrato getContratos() {
        return contratos;
    }

    public void setContratos(GestorContrato contratos) {
        this.contratos = contratos;
    }

    public GestorAuditoria getAuditorias() {
        return auditorias;
    }

    public void setAuditorias(GestorAuditoria auditorias) {
        this.auditorias = auditorias;
    }

    public GestorAuditor getAuditores() {
        return auditores;
    }

    public void setAuditores(GestorAuditor auditores) {
        this.auditores = auditores;
    }
    
    
    
    
   /* 
    public Cliente consultarCliente(DTOCliente){
        //def 
        return true; 
    }
    */
    
    public boolean borrarCliente(int id){
        //def 
        return true; 
    }
    
    /*
    public boolean agregarAuditor(DTOAuditor info){
        //def 
        return true; 
    }
    
    public boolean modificarAuditor(DTOAuditor info){
        //def
        return true; 
    }
    
    
    public Auditor consultarAuditor(DTOAuditor){
        //def 
        return true; 
    }
    
    
    public boolean borrarAuditor(int id){
        //def 
        return true; 
    }
    
      public boolean agregarAuditoria(DTOAuditoria info){
        //def 
        return true; 
    }
    
    public boolean modificarAuditoria(DTOAuditoria info){
        //def
        return true; 
    }
    
    
    public Auditoria consultarAuditoria(DTOAuditoria){
        //def 
        return true; 
    }
    
    
    public boolean borrarAuditoria(int id){
        //def 
        return true; 
    }
    */
    
}
    
