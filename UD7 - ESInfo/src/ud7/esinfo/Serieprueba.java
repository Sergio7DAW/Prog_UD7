/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud7.esinfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author 1DAW2425-09
 */
public class Serieprueba {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Crear Objeto
        Claseserie o1 = new Claseserie(1,1, 1);
        
        // Crear fichero, flujo fichero, flujo objeto, serializo objeto
//        File file = new File("C:\\Users\\1DAW2425-09\\Downloads\\prueba.bin");
//        FileOutputStream fos = new FileOutputStream(file);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(o1);
//        oos.close();
//        fos.close();
        
        FileInputStream fis = new FileInputStream("C:\\Users\\1DAW2425-09\\Downloads\\prueba.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Claseserie o1Deserie = (Claseserie)ois.readObject();
        
        System.out.println( o1Deserie.at1);
        System.out.println( o1Deserie.at2); // el static lo mete java
        System.out.println( o1Deserie.at3); // el transient no esta en fichero serializable 
        // se le da el valor por defecto del tipo int
        ois.close();
        fis.close();
    }
    

}
