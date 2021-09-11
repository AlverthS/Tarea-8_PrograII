/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea8;

/**
 *
 * @author DELL Latitude 5520
 */
public class NombreAlumno {
    
    private final String carne;
    private final String nombre;
    private final int edad;

    public NombreAlumno(String carne, String nombre, int edad) {
        this.carne = carne;
        this.nombre = nombre;
        this.edad = edad;}

    public int getEdad() {
    return edad; }   
}
