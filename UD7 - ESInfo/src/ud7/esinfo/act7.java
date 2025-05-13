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

public class act7 {
    public static void main(String[] args) throws IOException {
        // 1. FileWriter
        FileWriter fw = new FileWriter("filewriter.txt");
        fw.write("Texto desde FileWriter");
        fw.close();

        // 2. BufferedWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedwriter.txt"));
        bw.write("Texto con BufferedWriter");
        bw.close();

        // 3. CharArrayWriter
        CharArrayWriter caw = new CharArrayWriter();
        caw.write("Texto en memoria con CharArrayWriter");
        System.out.println("CharArrayWriter: " + caw.toString());
        caw.close();

        // 4. PrintWriter
        PrintWriter pw = new PrintWriter("printwriter.txt");
        pw.println("Línea desde PrintWriter");
        pw.printf("Número: %d%n", 123);
        pw.close();

        // 5. StringWriter
        StringWriter sw = new StringWriter();
        sw.write("Escrito en StringWriter (en memoria)");
        System.out.println("StringWriter: " + sw.toString());
        sw.close();

        // 6. PipedWriter y PipedReader
        PipedWriter pipeWriter = new PipedWriter();
        PipedReader pipeReader = new PipedReader(pipeWriter);
        new Thread(() -> {
            try {
                pipeWriter.write("Mensaje entre hilos (Writer)");
                pipeWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.print("PipedReader: ");
        int data1;
        while ((data1 = pipeReader.read()) != -1) {
            System.out.print((char) data1);
        }
        pipeReader.close();
        System.out.println();

        // 7. FileReader
        FileReader fr = new FileReader("filewriter.txt");
        System.out.print("FileReader: ");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
        System.out.println();

        // 8. BufferedReader
        BufferedReader br = new BufferedReader(new FileReader("filewriter.txt"));
        System.out.print("BufferedReader: ");
        String linea = br.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
        br.close();

        // 9. LineNumberReader
        LineNumberReader lnr = new LineNumberReader(new FileReader("filewriter.txt"));
        String l;
        while ((l = lnr.readLine()) != null) {
            System.out.println("Línea " + lnr.getLineNumber() + ": " + l);
        }
        lnr.close();

        // 10. CharArrayReader
        char[] chars = "Lectura desde array".toCharArray();
        CharArrayReader car = new CharArrayReader(chars);
        System.out.print("CharArrayReader: ");
        int c;
        while ((c = car.read()) != -1) {
            System.out.print((char) c);
        }
        car.close();
        System.out.println();

        // 11. StringReader
        StringReader sr = new StringReader("Lectura desde StringReader");
        System.out.print("StringReader: ");
        int s;
        while ((s = sr.read()) != -1) {
            System.out.print((char) s);
        }
        sr.close();
        System.out.println();
        
        /*
        java.lang.Object
            └── java.io.Writer
                  ├── FileWriter
                  ├── CharArrayWriter
                  ├── PrintWriter
                  ├── StringWriter
                  ├── PipedWriter
                  └── BufferedWriter

        
        java.lang.Object
            └── java.io.Reader
                  ├── FileReader
                  ├── CharArrayReader
                  ├── StringReader
                  ├── PipedReader
                  └── BufferedReader
                        └── LineNumberReader

        
        */
    }
}

