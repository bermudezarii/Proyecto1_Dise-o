/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Auditor;
import Datos.Auditoria;
import Datos.Cliente;
import Datos.Contrato;
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

    public Oficina() {
        cartera = new GestorCliente();
        auditores = new GestorAuditor();
        auditorias = new GestorAuditoria();
        contratos = new GestorContrato();
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
    
    private void printEstoyAqui() {
        System.out.print("Estoy en la oficina llamando al gestor ");
    }
    
    
    
    public Cliente consultarCliente(DTOCliente dtoC){
        printEstoyAqui();
        System.out.println("de clientes para consultar al cliente.");
        
        return (Cliente) cartera.selectUno(1);
    }
    
    public Auditor consultarAuditor(DTOAuditor dtoA) {
        printEstoyAqui();
        System.out.println("de auditores para consultar al auditor.");
        
        return (Auditor) auditores.selectUno(1);
    }
    
    public Auditoria consultarAuditoria(DTOAuditoria dtoAu) {
        printEstoyAqui();
        System.out.println("de auditorias para consultar al auditoria.");
        
        return (Auditoria) auditorias.selectUno(1);
    }
    
    public Contrato consultarContrato(DTOContrato dtoCo) {
        printEstoyAqui();
        System.out.println("de contratos para consultar el contrato.");
        
        return (Contrato) contratos.selectUno(1);
    }
    
}
    
