/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Vista.FrAuditor;

/**
 *
 * @author Arii
 */
public class UIAuditor {
    private DTOAuditor dtoA;
    private Oficina oficina;

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
    
    
    public boolean agregarAuditor(FrAuditor frAuditor){
        //def 
        return true; 
    }
    
    public boolean modificarAuditor(FrAuditor frAuditor){
         //def 
        return true; 
    }
    
    public boolean eliminarAuditor(FrAuditor frAuditor){
         //def 
        return true; 
    }
    
    public boolean verAuditor(FrAuditor frAuditor){
        System.out.println("Estoy en el UIAuditor creando el DTOAuditor.");
        dtoA = new DTOAuditor();
        oficina = new Oficina();
        
        System.out.println("Llamando a la oficina para consultar el auditor con el dto de auditor.");
        oficina.consultarAuditor(dtoA);
        
        return true; 
    }
}
