/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_sia;

/**
 *
 * @author Usuario
 */
public class ProgramaAcadémico {

    private boolean pregrado;
    private boolean maestria;
    private boolean especializacion;
    private boolean doctorado;
    private int codigo;
    private String nombre;
    private int semestres;


    public boolean isPregrado() {
        return this.pregrado;
    }

    public void setPregrado(boolean pregrado) {
        this.pregrado = pregrado;
    }

    public boolean isMaestria() {
        return this.maestria;
    }

    public void setMaestria(boolean maestria) {
        this.maestria = maestria;
    }

    public boolean isEspecializacion() {
        return this.especializacion;
    }

    public void setEspecializacion(boolean especializacion) {
        this.especializacion = especializacion;
    }

    public boolean isDoctorado() {
        return this.doctorado;
    }

    public void setDoctorado(boolean doctorado) {
        this.doctorado = doctorado;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestres() {
        return this.semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }


    
}
