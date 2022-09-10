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
public class Estudiante {

    private String nombre;
    private String apellido;
    private int documento;
    private int codigo;
    private String direccion;
    private double notas;
    private int numero_telefono;
    private String tipo_sangre;
    private ProgramaAcadémica programa_academico;
    private Profesor tutor;
    private Grupo grupo;
    private InformacionFinanciera info_financiera;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return  this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return  this.documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getCodigo() {
        return  this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return  this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getNotas() {
        return  this.notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public int getNumero_telefono() {
        return  this.numero_telefono;
    }

    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getTipo_sangre() {
        return  this.tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public ProgramaAcadémica getPrograma_academico() {
        return  this.programa_academico;
    }

    public void setPrograma_academico(ProgramaAcadémica programa_academico) {
        this.programa_academico = programa_academico;
    }

    public Profesor getTutor() {
        return  this.tutor;
    }

    public void setTutor(Profesor tutor) {
        this.tutor = tutor;
    }

    public Grupo getGrupo() {
        return  this.grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public InformacionFinanciera getInfo_financiera() {
        return  this.info_financiera;
    }

    public void setInfo_financiera(InformacionFinanciera info_financiera) {
        this.info_financiera = info_financiera;
    }



    
}
