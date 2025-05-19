/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud7.esinfo;

/**
 *
 * @author 1DAW2425-09
 */
import java.io.Serializable;

public class Newpersona implements Serializable {

    private String nombre;

    public Newpersona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
