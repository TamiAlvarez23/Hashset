/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consultaej1;

import clases.*;
import hashset.Cine;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class Hashset{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cine cine=new Cine("Roma", "Rivadavia 325");
        Scanner sc=new Scanner(System.in);
        Pelicula peli;
        
        String elige;
        
        do{
            
            peli=new Pelicula();
            System.out.println("Ingrese el Título de la pelicula: ");
            peli.setTitulo(sc.nextLine());
            System.out.print("Ingrese el nombre del Director: ");
            peli.setDirector(sc.nextLine());
            System.out.println("Ingrese la duración: ");
            peli.setDuracion(sc.nextInt());
             sc.nextLine();
            cine.agregarPelicula(peli);
            System.out.print("Quieres agregar otra pelicula?... (si/no)");
            elige=sc.nextLine();
           
        }while(!elige.equalsIgnoreCase("no"));
        
        cine.agregarPeliculas();//llama para agregar el hashset al arraylist
        
        cine.listarTodo();
        System.out.print("Ingrese cantidad de horas ");
        int duracion=sc.nextInt();
        cine.listarDuranMas(duracion);
        cine.listarOrdenadasPorTituloAZ();
        cine.listarOrdenadasPorDirectorAZ();        
        cine.listarMenorDuracion();
        sc.close();
    }
    
}
