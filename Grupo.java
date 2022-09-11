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
public class Grupo {

    private int numero;
    private int carga_horaria;
    private int cantidad_estudiantes;
    private Materia materia;
    private List<Estudiante> lista_estudiantes;
    private Profesor profesor;
    private HorariosClases horario;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCargaHoraria() {
        return carga_horaria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.carga_horaria = cargaHoraria;
    }

    public int getCantidadEstudiantes() {
        return cantidad_estudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidad_estudiantes = cantidadEstudiantes;
    }
    public Materia getMateria(){
        return materia;
    }
    public void setMateria(Materia materia){
        this.materia = materia;
    }
    public List<Estudiante> getLista_estudiantes(){
        return lista_estudiantes;
    }
    public void setLista_estudiantes(List<Estudiante> lista_estudiantes){
        this.lista_estudiantes = lista_estudiantes;
    }
    public Profesor getProfesor(){
        return profesor;
    }
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }

    public HorariosClases getHorario() {
        return horario;
    }

    public void setHorario(HorariosClases horario) {
        this.horario = horario;
    }




}
