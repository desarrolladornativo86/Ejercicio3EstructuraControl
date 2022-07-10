package com.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
//Definimos la cantidad de nombres
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nombres que quiere visualizar: ");
        int tamañoNombres = Integer.parseInt(teclado.nextLine());
        String[] nombres = new String[tamañoNombres];

        for (int i = 0; i < tamañoNombres; i++) {
            System.out.println("Ingrese el nombre " + (i+1) + " = ");
            nombres[i] = teclado.nextLine();
        }

        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
    }
}