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
public class Comparador {
    
    private int edad;
    private double precio;
    public Comparador() {
    this.edad = 0;
    this.precio = 0;}    
    public void setEdad(int edad) {
    this.edad = edad;}    
    public void setPrecio(double precio) {
    this.precio = precio;}
   
    public boolean igualQueP(Object pr) {
        Producto pro = (Producto) pr;
        return this.precio == pro.getPrecio();}
    public boolean menorQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() < this.precio;}
    public boolean mayorQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() > this.precio;}
    public boolean mayorIgualQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() >= this.precio;}   
    public boolean menorIgualQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() <= this.precio;}
    
    public boolean igualQueA(Object al) {
        NombreAlumno a = (NombreAlumno) al;
        return this.edad == a.getEdad();}
    public boolean menorQueA(Object al) {
        NombreAlumno a = (NombreAlumno) al;
        return a.getEdad() < this.edad;}
    public boolean mayorQueA(Object al) {
        NombreAlumno a = (NombreAlumno) al;
        return a.getEdad() > this.edad;}    
    public boolean mayorIgualQueA(Object al) {
        NombreAlumno a = (NombreAlumno) al;
        return a.getEdad() >= this.edad;}  
    public boolean menorIgualQueA(Object al) {
        NombreAlumno a = (NombreAlumno) al;
        return a.getEdad() <= this.edad;}   
}
