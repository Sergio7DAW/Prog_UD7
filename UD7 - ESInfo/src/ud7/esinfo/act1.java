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
import java.util.Scanner;

public class act1 {
   public static void main(String[] args) throws IOException {

        System.out.println("Introduce 4 caracteres: ");

        char c1 = (char)System.in.read();
        char c2 = (char) System.in.read();
        char c3 = (char) System.in.read();
        char c4 = (char) System.in.read();
     

        // 1. 
        System.out.write(c1);
        System.out.write('\n');
        System.out.flush();

        // 2.
        System.out.print((char) c2);

        // 3.
        System.out.println((char) c3);

        // 4.
        System.out.printf("%c", c4);
        
           System.out.println(" ");
           System.out.println("------------------");
    }
    
}
