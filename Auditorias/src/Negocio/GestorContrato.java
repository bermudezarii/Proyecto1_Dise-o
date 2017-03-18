/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Contrato;
import java.util.ArrayList;

/**
 *
 * @author Arii
 */
public class GestorContrato extends Gestor{
    private ArrayList<Contrato> contratos; 
    private DAOContratoDB daoCo;

    public GestorContrato() {
        this.contratos = new ArrayList<>();
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
        System.out.println("Estoy en el gestor de contratos llamando al DAOContratos.");
        daoCo = new DAOContratoDB();
        return daoCo.ver(new Contrato());
    }

    @Override
    public Object selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
