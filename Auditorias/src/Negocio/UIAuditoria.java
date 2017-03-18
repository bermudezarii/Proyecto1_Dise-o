/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Vista.FrAuditoria;

/**
 *
 * @author Arii
 */
public class UIAuditoria {
    private DTOAuditoria dtoAu;
    private Oficina oficina; 

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
   
    
    public boolean agregarAuditoria(FrAuditoria frAuditoria){
        //def 
        return true; 
    }
    
    public boolean modificarAuditoria(FrAuditoria frAuditoria){
         //def 
        return true; 
    }
    
    public boolean eliminarAuditoria(FrAuditoria frAuditoria){
         //def 
        return true; 
    }
    
    public boolean verAuditoria(FrAuditoria frAuditoria){
        System.out.println("Estoy en el UIAuditoria creando el DTOAuditoria.");
        
        dtoAu = new DTOAuditoria();
        oficina = new Oficina();
        
        System.out.println("Llamando a la oficina para consultar la Auditoria con el dto de auditoria.");
        oficina.consultarAuditoria(dtoAu);
        return true; 
    }
}
