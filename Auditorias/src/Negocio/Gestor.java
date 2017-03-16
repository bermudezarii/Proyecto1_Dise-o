/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Arii
 */
public abstract class Gestor {
    public abstract boolean agregar(Object parametro); 
    public abstract boolean actualizar(Object parametro);
    public abstract boolean borrar(int id); 
    public abstract Object selectUno(int id);
    public abstract Object selectAll(); 
}
