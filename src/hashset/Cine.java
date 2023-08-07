/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashset;

import java.util.*;

/**
 *
 * @author Tamara
 */
public class Cine {
    private String nombre;
    private String direccion;
    ArrayList<Pelicula> proyecciones;
    HashSet<Pelicula> proyecciones2;//ejercicio 2

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        proyecciones=new ArrayList<>();
        proyecciones2=new HashSet<>();//ej2
    }

    public Cine() {
        
    }
        
    
    public void agregarPelicula(Pelicula pelicula){
        proyecciones2.add(pelicula);
    }
    
    /*agregar hashset a arraylist*/
     public void agregarPeliculas(){
        proyecciones=new ArrayList<>(proyecciones2);
    }
    
    public void listarTodo(){
        System.out.println("pelicula registradas en el cine");
        for(Pelicula proye: proyecciones){
            System.out.println("Titulo "+proye.getTitulo());
            System.out.println("Director "+proye.getDirector());
            System.out.println("Duración "+proye.getDuracion() +" horas");
        }
    }
    
    public void listarDuranMas(int horas){
        
        System.out.println("Peliculas con mayor duración "+ horas +"horas ");
         for(Pelicula proye: proyecciones){
             if(proye.getDuracion()> horas){
                  System.out.println("Titulo "+proye.getTitulo());
                  System.out.println("Director "+proye.getDirector());
                  System.out.println("Duración "+proye.getDuracion() +" horas");
             }
         }
        
    }
    
    public void listarMenorDuracion(){
         System.out.println("Peliculas ordenadas de menor a mayor duración");
        Collections.sort(proyecciones,Pelicula.compararDuracion);
        listarTodo();
    }
    
    public void listarOrdenadasPorTituloAZ(){
        System.out.println("Peliculas ordenadas alfabéticamente por título");
        Collections.sort(proyecciones,Comparator.comparing(Pelicula::getTitulo));
         for(Pelicula proye: proyecciones){
            System.out.println("Titulo "+proye.getTitulo());
            System.out.println("Director "+proye.getDirector());
            System.out.println("Duración "+proye.getDuracion() +" horas");
        }
    }
    
     public void listarOrdenadasPorDirectorAZ(){
        System.out.println("Peliculas ordenadas alfabéticamente por director");
        Collections.sort(proyecciones,Pelicula.compararDirector);
        listarTodo();        
    }
    
    public void listarOrdenadasPorDirectorAZ2(){
        System.out.println("Peliculas ordenadas alfabéticamente por director");
        Collections.sort(proyecciones,(p1,p2)->p1.getDirector().compareToIgnoreCase(p2.getDirector()));
        listarTodo();        
    }
    
}

