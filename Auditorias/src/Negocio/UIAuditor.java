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
    class UIAuditor {
    private DTOAuditor dtoA;
    private Oficina oficina; 

    public UIAuditor(DTOAuditor dtoA, Oficina oficina) {
        this.dtoA = dtoA;
        this.oficina = oficina;
    }

    public DTOAuditor getDtoA() {
        return dtoA;
    }

    public void setDtoA(DTOAuditor dtoA) {
        this.dtoA = dtoA;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
    
    
    public boolean agregarAuditor(JFrame FrAuditor){
        //def 
        return true; 
    }
    
    public boolean modificarAuditor(JFrame FrAuditor){
         //def 
        return true; 
    }
    
    public boolean eliminarAuditor(JFrame FrAuditor){
         //def 
        return true; 
    }
    
    public boolean verAuditor(JFrame FrAuditor){
        //def 
        return true; 
    }
}
