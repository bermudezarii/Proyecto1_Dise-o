/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Arii
 */
public class EstrategiaN implements Strategy{

    /**
     *
     * @return
     */
    @Override
    public boolean inspeccionDetallada(){
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean revisionDeSistemas(){
        return true; 
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean analisisDeMejoras(){
        return true; 
    }
    
    /**
     *
     * @return
     */
    @Override
    public void annadirFuncionalidades(){
        
    }
}
