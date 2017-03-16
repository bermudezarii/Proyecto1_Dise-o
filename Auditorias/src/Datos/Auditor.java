/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Ariana
 */

public class Auditor extends Persona {
    
    private GradoAcademico grado; 
    private Evaluacion nota; 
    
    public Auditor(int cedula, String nombre, String apellido1, String apellido2, int telefono, String correo) {
        super(cedula, nombre, apellido1, apellido2, telefono, correo);
    }

    public GradoAcademico getGrado() {
        return grado;
    }

    public void setGrado(GradoAcademico grado) {
        this.grado = grado;
    }

    public Evaluacion getNota() {
        return nota;
    }

    public void setNota(Evaluacion nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Auditor{" + "grado=" + grado + ", nota=" + nota + '}';
    }
    
    
}
