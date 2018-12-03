/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacollection;

import java.util.Collection;
import java.util.ArrayList;

/**
 *
 * @author Alfredo Campelo Guerra
 */
public class PruebaCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection<String> listaMarcaChoches = new ArrayList();

        listaMarcaChoches.add("Porsche");
        listaMarcaChoches.add("Audi");
        listaMarcaChoches.add("Mercedes");
        listaMarcaChoches.add("Seat");
        listaMarcaChoches.add("Renault");
        listaMarcaChoches.add("Honda");
        listaMarcaChoches.add("Tesla");

        System.out.println("Número de elementos antes de eliminar: " + listaMarcaChoches.size());
        System.out.println(listaMarcaChoches.toString());

        listaMarcaChoches.remove("Seat");
        listaMarcaChoches.remove("Mercedes");

        System.out.println("Número de elementos despues de eliminar Seat y Mercedes: "
                + listaMarcaChoches.size());
        System.out.println(listaMarcaChoches.toString());

    }

}
