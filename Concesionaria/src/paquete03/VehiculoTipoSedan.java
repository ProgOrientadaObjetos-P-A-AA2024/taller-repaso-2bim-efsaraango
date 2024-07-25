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
public class VehiculoTipoSedan extends Vehiculo {

    private double porcentajeDescuento;

    public VehiculoTipoSedan(Comprador propietario, String marca, double precioBase, double porcentajeDescuento) {
        super(propietario, marca, precioBase);
        this.porcentajeDescuento = porcentajeDescuento;
        calcularPreciofinal();
    }

    @Override
    public void calcularPreciofinal() {
        double valorDescuento = precioBase * (porcentajeDescuento / 100);
        double seguroMecanico = precioBase * 0.01;
        this.precioFinal = precioBase - valorDescuento + seguroMecanico;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nTipo: Sedan\n"
                + "Descuento: %.2f%%\nSeguro Mecánico: %.2f\n"
                + "Precio Final: %.2f",
                 super.toString(),
                porcentajeDescuento,
                precioBase * 0.01,
                precioFinal);
        return cadena;
    }
}
