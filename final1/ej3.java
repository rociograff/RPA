/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */

/**
 * a)Diseñe un módulo que recibe por parámetro los enteros Fil y CantPorFil. 
 * El módulo debe permitir ingresar filas de números (Fil) donde cada fila contiene  CantPorFil números enteros. 
 * Para cada fila contar y mostrar la cantidad de pares ingresados.
 * Por ejemplo para Fil=3 y CantPorFil=4 
 * Fila 1: 4 3   5  6  Pares ingresados: 2
 * Fila 2: 3  5  4  3  Pares ingresados: 1
 * Fila 3: 7  2  6  8  Pares ingresados: 3
 * b)Escriba un algoritmo principal que lea la cantidad de filas y columnas deseadas. 
 * Si los valores son mayores o iguales que 1 y menores o iguales 9 llame al módulo anterior, sino imprima un mensaje  de error.
 */
public class ej3 {
    
    public static int fila (int fil, int cantPorFil) {
        //Este modulo imprime la cantidad de pares ingresados
        
        
        
    }
    
    public static void main (String [] args) {
        //Este algoritmo imprime la cantidad de filas y columnas
        
        int fil, cantPorFil;
        
        System.out.println("Ingrese la fila");
        fil = TecladoIn.readLineInt();
        System.out.println("Ingrese la columna");
        cantPorFil = TecladoIn.readLineInt();

        if (cantPorFil >=1 && cantPorFil <=9) {
            for (fil = 1;fil <= cantPorFil; fil++) {
                for (cantPorFil = 1; cantPorFil <= fil; cantPorFil++) {
                    System.out.println(fila(fil, cantPorFil)," ");
                }
                System.out.println(" ");
            } 
        }else {
            System.out.println("Error");
        }
        
        
        
    }
    
}
