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
public class Lista {

    protected Nodo inicio, fin;

    public Lista() {
        inicio = fin = null;
    }

    public void agregarAlInicio(int num, String nombre) {
        inicio = new Nodo(num, nombre, inicio);

        if (fin == null) {
            fin = inicio;
        }
    }

    public void agregarAlFinal(int num, String nombre) {
        if (!verificarRepetido(num, nombre)) {
            if (inicio != null) {
                fin.siguiente = new Nodo(num, nombre);
                fin = fin.siguiente;
            } else {
                inicio = fin = new Nodo(num, nombre);
            }
        } else {
            System.out.println("repetido....");
        }
    }

    public boolean verificarRepetido(int num, String nombre) {
        Nodo recorrer;
        if (inicio != null) {
            recorrer = inicio;
            while (recorrer != null) {
                if (recorrer.num == num && recorrer.nombre.equals(nombre)) {
                    return true;
                }
                recorrer = recorrer.siguiente;
            }
        } 
        return false;
    }

    public void mostrarLista() {
        Nodo recorrer;
        if (inicio != null) {
            recorrer = inicio;
            while (recorrer != null) {
                System.out.println(recorrer.toString());
                recorrer = recorrer.siguiente;
            }
        } else {
            System.out.println("Lista vacía");
        }
    }

}
