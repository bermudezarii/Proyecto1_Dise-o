/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Vista.FrCliente;

/**
 *
 * @author Arii
 */
public class UICliente {
    private DTOCliente dtoC;
    private Oficina oficina; 

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
    
    public boolean agregarCliente(FrCliente FrCliente){
        //def 
        return true; 
    }
    
    public boolean modificarCliente(FrCliente FrCliente){
         //def 
        return true; 
    }
    
    public boolean eliminarCliente(FrCliente FrCliente){
         //def 
        return true; 
    }
    
    public boolean verCliente(FrCliente frCliente){
        System.out.println("Estoy en el UICliente creando el DTOCliente.");
        
        dtoC = new DTOCliente();
        oficina = new Oficina();
        
        System.out.println("Llamando a la oficina para consultar el cliente con el dto de cliente.");
        oficina.consultarCliente(dtoC);
        
        return true; 
    }
    
    
    
}
