/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashset;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Tamara
 */
public class Pelicula implements Comparator{
    private String titulo;
    private String director;
    private Integer duracion;

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public static Comparator<Pelicula> compararDuracion=new Comparator<Pelicula>(){
      
        @Override
        public int compare(Pelicula p1,Pelicula p2){
            return p1.duracion.compareTo(p2.duracion);
        }
        
    };
    
    public static Comparator<Pelicula> compararTitulo=new Comparator<Pelicula>(){
      
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.titulo.compareTo(p2.titulo);
        }
        
    };
    
     public static Comparator<Pelicula> compararDirector=new Comparator<Pelicula>(){
      
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.director.compareTo(p2.director);
        }
        
    };

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        return hash;
        
        //return getTitulo().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula peli = (Pelicula) obj;
        return Objects.equals(this.titulo, peli.titulo);
        
        //return this.titulo.equals(peli.getTitulo());
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
}
