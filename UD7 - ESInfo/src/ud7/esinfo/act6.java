/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud7.esinfo;

/**
 *
 * @author 1DAW2425-09
 */
import java.io.*;
import java.io.IOException;

import java.io.*;
import java.util.*;

public class act6 {
    public static void main(String[] args) throws IOException {
        // 1. FileOutputStream
        FileOutputStream fos = new FileOutputStream("archivo.txt");
        fos.write("Hola DAW".getBytes());
        fos.close();

        // 2. BufferedOutputStream
        FileOutputStream fos2 = new FileOutputStream("buffered.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos2);
        bos.write("Texto con buffer".getBytes());
        bos.close();

        // 3. DataOutputStream
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("datos.bin"));
        dos.writeInt(123);
        dos.writeDouble(3.14);
        dos.writeBoolean(true);
        dos.close();

        // 4. ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write("En memoria".getBytes());
        System.out.println("ByteArrayOutputStream: " + baos.toString());
        baos.close();

        // 5. PrintStream
        PrintStream ps = new PrintStream("print.txt");
        ps.println("Línea 1");
        ps.printf("Número: %d%n", 10);
        ps.close();

        // 6. PipedOutputStream y PipedInputStream
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        new Thread(() -> {
            try {
                pos.write("Mensaje entre hilos".getBytes());
                pos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.print("PipedInputStream: ");
        int pipedData;
        while ((pipedData = pis.read()) != -1) {
            System.out.print((char) pipedData);
        }
        pis.close();
        System.out.println();

        // 7. FileInputStream
        FileInputStream fis = new FileInputStream("archivo.txt");
        System.out.print("FileInputStream: ");
        int data1;
        while ((data1 = fis.read()) != -1) {
            System.out.print((char) data1);
        }
        fis.close();
        System.out.println();

        // 8. BufferedInputStream
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("archivo.txt"));
        System.out.print("BufferedInputStream: ");
        int data2;
        while ((data2 = bis.read()) != -1) {
            System.out.print((char) data2);
        }
        bis.close();
        System.out.println();

        // 9. DataInputStream
        DataInputStream dis = new DataInputStream(new FileInputStream("datos.bin"));
        int num = dis.readInt();
        double dec = dis.readDouble();
        boolean bool = dis.readBoolean();
        dis.close();
        System.out.println("DataInputStream: " + num + ", " + dec + ", " + bool);

        // 10. ByteArrayInputStream
        byte[] datosMemoria = "Datos en memoria".getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(datosMemoria);
        System.out.print("ByteArrayInputStream: ");
        int data3;
        while ((data3 = bais.read()) != -1) {
            System.out.print((char) data3);
        }
        bais.close();
        System.out.println();

        // 11. SequenceInputStream
        FileOutputStream f1 = new FileOutputStream("archivo1.txt");
        f1.write("Hola ".getBytes());
        f1.close();
        FileOutputStream f2 = new FileOutputStream("archivo2.txt");
        f2.write("mundo!".getBytes());
        f2.close();
        FileInputStream s1 = new FileInputStream("archivo1.txt");
        FileInputStream s2 = new FileInputStream("archivo2.txt");
        SequenceInputStream sis = new SequenceInputStream(s1, s2);
        System.out.print("SequenceInputStream: ");
        int data4;
        while ((data4 = sis.read()) != -1) {
            System.out.print((char) data4);
        }
        sis.close();
        System.out.println();
        
        //tods als clases pertenecen an java.io.
        
        /*
        java.lang.Object
            └── java.io.OutputStream
                    ├── FileOutputStream
                    ├── ByteArrayOutputStream
                    ├── FilterOutputStream
                    │     ├── BufferedOutputStream
                    │     ├── DataOutputStream
                    │     └── PrintStream
                    └── PipedOutputStream
        
        
        
        java.lang.Object
            └── java.io.InputStream
                    ├── FileInputStream
                    ├── ByteArrayInputStream
                    ├── FilterInputStream
                    │     ├── BufferedInputStream
                    │     └── DataInputStream
                    ├── SequenceInputStream
                    └── PipedInputStream


        */
    }
}

