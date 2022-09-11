/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_sia;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Profesor {

    private String nombre;
    private String apellido;
    private int codigo;
    private ArrayList<String> titulos;
    private String categoria;
    private String ubicacion_oficina;


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<String> getTitulos() {
        return this.titulos;
    }

    public void setTitulos(ArrayList<String> titulos) {
        this.titulos = titulos;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUbicacion_oficina() {
        return this.ubicacion_oficina;
    }

    public void setUbicacion_oficina(String ubicacion_oficina) {
        this.ubicacion_oficina = ubicacion_oficina;
    }

}
