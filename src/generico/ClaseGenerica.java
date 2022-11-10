package generico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guada
 */
public class ClaseGenerica <T>{
    //T es un tipo de dato abstracto que sera reemplazado al momento de la clase
    T objeto;//objeto es de tipo T
    
    //Constructor 
    public ClaseGenerica(T o){
        this.objeto = o;     
   }
    
    public T getObjeto(){
        return this.objeto;
    }
    
    public void setObjeto(T o){
        this.objeto=o;
    }
    
    //muestra el tipo de dato efectivo con el que trabaja el objeto de esta clase 
    public void getType(){
        System.out.println("El tipo T efectivo es: " + this.objeto.getClass().getName());
    }
}


