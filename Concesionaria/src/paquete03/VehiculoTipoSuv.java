/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.Comprador;

/**
 *
 * @author Det-Pc
 */
public class VehiculoTipoSuv extends Vehiculo {

    private double porcentajeSeguro;

    public VehiculoTipoSuv(Comprador propietario, String marca, double precioBase, double porcentajeSeguro) {
        super(propietario, marca, precioBase);
        this.porcentajeSeguro = porcentajeSeguro;
        calcularPreciofinal();
    }

    public void calcularPreciofinal() {
        double seguroPersonas = precioBase * (porcentajeSeguro / 100);
        precioFinal = precioBase + seguroPersonas;
    }

    @Override
    public String toString() {
        return String.format("%s, Tipo: SUV, Seguro: %.2f%%, Precio Final: %.2f",
                super.toString(), porcentajeSeguro, precioFinal);
    }
}
