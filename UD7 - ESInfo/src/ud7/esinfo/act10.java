/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud7.esinfo;

/**
 *
 * @author 1DAW2425-09
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class act10 {
    public static void main(String[] args) {
        Newpersona maradona = new Newpersona("Maradona");

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\1DAW2425-09\\Downloads\\persona.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(maradona);

            oos.close();
            fos.close();

            System.out.println("Objeto serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

