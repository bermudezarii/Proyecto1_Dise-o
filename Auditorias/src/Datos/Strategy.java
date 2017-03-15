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
public interface Strategy {
    public boolean inspeccionDetallada(); 
    public boolean revisionDeSistemas(); 
    public boolean analisisDeMejoras(); 
    public void annadirFuncionalidades(); 
}
