/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Arii
 */
public class GestorCliente extends Gestor{
    private ArrayList<Cliente> clientes; 
    private DAOClienteBD daoCliente; 

    public GestorCliente() {
        this.clientes = new ArrayList<>();
    }

    public DAOClienteBD getDaoCliente() {
        return daoCliente;
    }

    public void setDaoCliente(DAOClienteBD daoCliente) {
        this.daoCliente = daoCliente;
    }

       @Override
    public boolean agregar(Object parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(Object parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object selectUno(int id) {
        System.out.println("Estoy en el gestor de clientes llamando al DAOCliente.");
        daoCliente = new DAOClienteBD();
        return daoCliente.ver(new Cliente());
    }

    @Override
    public Object selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
