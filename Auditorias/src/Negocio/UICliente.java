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
public class UICliente {
    private DTOCliente dtoC;
    private Oficina oficina; 

    public UICliente(DTOCliente dtoC, Oficina oficina) {
        this.dtoC = dtoC;
        this.oficina = oficina;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public DTOCliente getDtoC() {
        return dtoC;
    }

    public void setDtoC(DTOCliente dtoC) {
        this.dtoC = dtoC;
    }
    
    public boolean agregarCliente(JFrame FrCliente){
        //def 
        return true; 
    }
    
    public boolean modificarCliente(JFrame FrCliente){
         //def 
        return true; 
    }
    
    public boolean eliminarCliente(JFrame FrCliente){
         //def 
        return true; 
    }
    
    public boolean verCliente(JFrame FrCliente){
        //def 
        return true; 
    }
    
    
    
}
