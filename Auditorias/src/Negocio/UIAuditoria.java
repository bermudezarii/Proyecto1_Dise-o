/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import javax.swing.JFrame;

/**
 *
 * @author Arii
 */
public class UIAuditoria {
    private DTOAuditoria dtoAu;
    private Oficina oficina; 

    public UIAuditoria(DTOAuditoria dtoAu, Oficina oficina) {
        this.dtoAu = dtoAu;
        this.oficina = oficina;
    }

    public DTOAuditoria getDtoAu() {
        return dtoAu;
    }

    public void setDtoAu(DTOAuditoria dtoAu) {
        this.dtoAu = dtoAu;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
   
    
    public boolean agregarAuditoria(JFrame FrAuditoria){
        //def 
        return true; 
    }
    
    public boolean modificarAuditoria(JFrame FrAuditoria){
         //def 
        return true; 
    }
    
    public boolean eliminarAuditoria(JFrame FrAuditoria){
         //def 
        return true; 
    }
    
    public boolean verAuditoria(JFrame FrAuditoria){
        //def 
        return true; 
    }
}
