/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author JOSE-MA
 */
public class Nodo {
    public int num;
    public String nombre;
    
    public Nodo siguiente;

    
    public Nodo(int num, String nombre) {
        this.num = num;
        this.nombre = nombre;
    }

    public Nodo(int num, String nombre, Nodo siguiente) {
        this.num = num;
        this.nombre = nombre;
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "num=" + num + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
