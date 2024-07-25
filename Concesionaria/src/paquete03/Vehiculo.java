/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;
import paquete02.*;
import paquete02.Comprador;

/**
 *
 * @author Det-Pc
 */
public abstract class Vehiculo {
    
    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Vehiculo(Comprador pro, String m, double pb) {
        propietario = pro;
        marca = m;
        precioBase = pb;
      
    }
    
    public abstract void calcularPreciofinal();

    public void establecerPropietario(Comprador p) {
        propietario = p;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerPrecioBase(double p) {
        precioBase = p;
    }

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }
    
    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Marca: %s\n"
                + "Propietario: %s\n"
                + "Precio Base: %.2f\n"
                + "Precio Final: %.2f", 
                marca, 
                propietario, 
                precioBase, 
                precioFinal);
        return cadena;
    }
    
    
    
    
    
    
}
