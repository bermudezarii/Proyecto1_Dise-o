/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Auditoria;
import java.util.ArrayList;

/**
 *
 * @author Arii
 */
public class GestorAuditoria extends Gestor{
    private ArrayList<Auditoria> auditorias;
    private DAOAuditoriaBD daoAu;

    public GestorAuditoria() {
        this.auditorias = new ArrayList<>();
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
        System.out.println("Estoy en el gestor de auditorias llamando al DAOAuditorias.");
        daoAu = new DAOAuditoriaBD();
        return daoAu.ver(new Auditoria());
    }

    @Override
    public Object selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
