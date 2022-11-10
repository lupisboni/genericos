package generico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guada
 */
public class TestingClaseGenerica {
    
    public static void main(String[] args){
        
        //Declarar un objeti de la clase generica
        ClaseGenerica <String> objeto1;
        ClaseGenerica <Integer> objeto2;
        
        //construir el objeto 1
        objeto1=new ClaseGenerica<>("Ginger");
        System.out.println("El contenido del objetos1 es: "+objeto1.getObjeto());
        objeto1.getType();
        
        //contruir y usar el objeto2 
        objeto2=new ClaseGenerica<Integer>(100);
        System.out.println("El contenido del objeto 2 es: "+objeto2.getObjeto());
        objeto2.getType();
    }
}