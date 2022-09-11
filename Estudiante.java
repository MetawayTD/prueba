/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_sia;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private int documento;
    private int codigo;
    private String direccion;
    private double [] notas;
    private int numero_telefono;
    private String tipo_sangre;
    private ProgramaAcadémico programa_academico;
    private Profesor tutor;
    private List<Grupo> grupos;
    private InformacionFinanciera info_financiera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double [] getNotas() {
        return notas;
    }

    public void setNotas(double [] notas) {
        this.notas = notas;
    }

    public int getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public ProgramaAcadémico getPrograma_academico() {
        return programa_academico;
    }

    public void setPrograma_academico(ProgramaAcadémico programa_academico) {
        this.programa_academico = programa_academico;
    }

    public Profesor getTutor() {
        return tutor;
    }

    public void setTutor(Profesor tutor) {
        this.tutor = tutor;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupo(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public InformacionFinanciera getInfo_financiera() {
        return info_financiera;
    }

    public void setInfo_financiera(InformacionFinanciera info_financiera) {
        this.info_financiera = info_financiera;
    }



    
}
