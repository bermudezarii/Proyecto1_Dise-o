/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Auditor;
import java.util.ArrayList;

/**
 *
 * @author Arii
 */
public class GestorAuditor extends Gestor{
    private ArrayList<Auditor> auditores; 
    private DAOAuditorBD daoA; 

    public GestorAuditor() {
        this.auditores = new ArrayList<>();
    }

    public DAOAuditorBD getDaoAuditor() {
        return daoA;
    }

    public void setDaoAuditor(DAOAuditorBD daoAuditor) {
        this.daoA= daoAuditor;
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
        System.out.println("Estoy en el gestor de auditores llamando al DAOAuditor.");
        daoA = new DAOAuditorBD();
        return daoA.ver(new Auditor());
    }

    @Override
    public Object selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
