/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud7.esinfo;

import java.io.Serializable;

/**
 *
 * @author 1DAW2425-09
 */
public class Claseserie implements Serializable {

    private static final long serialVersionUId = 1L;
    int at1;
    static int at2;
    transient int at3;

    public Claseserie(int at1, int at2, int at3) {
        this.at1 = at1;
        this.at2 = at2;
        this.at3 = at3;
    }

}
