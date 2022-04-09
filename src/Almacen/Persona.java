/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Almacen;

/**
 *
 * @author tutu5
 */
public abstract class Persona {
    
    private String nombre;
    
    public Persona (String _nombre){
        
        this.nombre= _nombre;
        
    }
    
    public String getNombre(){
        
        return this.nombre;
    }
    
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    
    public abstract int getTipo();
    
}
