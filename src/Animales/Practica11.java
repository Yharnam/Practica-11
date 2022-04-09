/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Animales;

import java.util.*;

/**
 *
 * @author tutu5
 */
public class Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Animales> Lista = new ArrayList();
        Lista.add(new perro());
        Lista.add(new Gato());
        Lista.add(new Pajaro());
        Lista.get(0).saludar("Firulais");
        Lista.get(1).saludar("Malenio");
        Lista.get(2).saludar("Roni");
    }
    
}
