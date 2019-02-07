/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.Scanner;

/**
 *
 * @author JOSE-MA
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;
        Lista lista = new Lista();

        do {
            System.out.println("Menu");
            System.out.println("Opción 1>>> Insertar un nuevo nodo");
            System.out.println("Opción 2>>> Mostrar lista");
            System.out.println("Opción 3>>> Salir");
            System.out.println("\n Ingresa la opción");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingresa un numero");
                    int num = leer.nextInt();
                    System.out.println("Ingresa un nombre");
                    String nombre = leer.next();
                    lista.agregarAlFinal(num, nombre);
                    break;

                case 2:
                    System.out.println("Mostrando nodos");
                    lista.mostrarLista();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (op != 3);

    }

}
