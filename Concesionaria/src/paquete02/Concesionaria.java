/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;
import paquete03.Vehiculo;

/**
 *
 * @author Det-Pc
 */
public class Concesionaria {

    private String nomConcesionaria;
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria(String n) {
        nomConcesionaria = n;
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public double calcularVentasTotales() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            total += v.obtenerPrecioFinal();
        }
        return total;
    }

    public Vehiculo obtenerVehiculoMasCaro() {
        Vehiculo masCaro = null;
        for (Vehiculo v : vehiculos) {
            if (masCaro == null || v.obtenerPrecioFinal() > masCaro.obtenerPrecioFinal()) {
                masCaro = v;
            }
        }
        return masCaro;
    }

    public Vehiculo obtenerVehiculoMasBarato() {
        Vehiculo masBarato = null;
        for (Vehiculo v : vehiculos) {
            if (masBarato == null || v.obtenerPrecioFinal() < masBarato.obtenerPrecioFinal()) {
                masBarato = v;
            }
        }
        return masBarato;
    }

    @Override
    public String toString() {
       String cadena =  String.format("Concesionaria: %s\n"
                + "Total de Ventas: %.2f\n"
                + "Vehículo más caro: %s\n"
                + "Vehículo más barato: %s",
                nomConcesionaria,
                calcularVentasTotales(),
                obtenerVehiculoMasCaro(),
                obtenerVehiculoMasBarato());
        return cadena;
    }
}
