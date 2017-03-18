/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Vista.FrContrato;

/**
 *
 * @author ErickHdez
 */
public class UIContrato {
    private DTOContrato dtoCo;
    private Oficina oficina;
    
    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public DTOContrato getDtoC() {
        return dtoCo;
    }

    public void setDtoC(DTOContrato dtoCo) {
        this.dtoCo = dtoCo;
    }
    
    public boolean agregarContrato(FrContrato frContrato){
        //def 
        return true; 
    }
    
    public boolean modificarContrato(FrContrato frContrato){
         //def 
        return true; 
    }
    
    public boolean eliminarContrato(FrContrato frContrato){
         //def 
        return true; 
    }
    
    public boolean verContrato(FrContrato frContrato){
        System.out.println("Estoy en el UIContrato creando el DTOContrato.");
        
        dtoCo = new DTOContrato();
        oficina = new Oficina();
        
        System.out.println("Llamando a la oficina para consultar el contrato con el dto de contrato.");
        oficina.consultarContrato(dtoCo);
        
        return true; 
    }
}
