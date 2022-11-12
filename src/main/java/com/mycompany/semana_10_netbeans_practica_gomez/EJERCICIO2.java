/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_10_netbeans_practica_gomez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Franz
 */

class Alumno {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

public class EJERCICIO2 {
    private ArrayList<Alumno> listaAlumnos;

    public static void main(String[] args) {
        EJERCICIO2 proyectoAlumnos = new EJERCICIO2();
        proyectoAlumnos.ingresarDatos();
        proyectoAlumnos.ordenarPorNombre();
        proyectoAlumnos.ordenarPorNota();
    }

    public void ingresarDatos() {
        String nombre, respuesta;
        double nota;
        Scanner entrada = new Scanner(System.in);
        listaAlumnos = new ArrayList();
        int i = 0;
        do {
            System.out.println("\nAlumno " + ++i);
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Nota: ");
            nota = Double.parseDouble(entrada.nextLine());
            Alumno alumno = new Alumno(nombre, nota);
            listaAlumnos.add(alumno);
            System.out.print("Desea ingresar nuevo alumno (S/N): ");
            respuesta = entrada.nextLine();
        } while (respuesta.equals("S"));
    }

    public void imprimirDatos() {
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i).getNombre() + ", " 
            + listaAlumnos.get(i).getNota());
        }
    }

    private void ordenarPorNombre() {
        System.out.println("\nDatos en orden alfabético:");
        Collections.sort(listaAlumnos, (Alumno alumno1, Alumno alumno2)

        -> alumno1.getNombre().compareTo(alumno2.getNombre()));
        imprimirDatos();

    }

    private void ordenarPorNota() {
        System.out.println("\nDatos en orden de mérito:");
        Collections.sort(listaAlumnos, (Alumno alumno1, Alumno alumno2)
        -> new Double(alumno2.getNota()).compareTo(alumno1.getNota()));
        imprimirDatos();
    }
}
