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
public class HorariosClases {

    private String [] dias;
    private int [] horas;
    private List<Grupo> grupos;

    public String [] getDias() {
        return dias;
    }

    public void setDias(String [] dias) {
        this.dias = dias;
    }

    public int [] getHoras() {
        return horas;
    }

    public void setHoras(int [] horas) {
        this.horas = horas;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

}
