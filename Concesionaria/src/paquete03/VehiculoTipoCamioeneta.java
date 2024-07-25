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
public class VehiculoTipoCamioeneta extends Vehiculo {

    private double porcentajeImportacion;

    public VehiculoTipoCamioeneta(Comprador propietario, String marca, 
            double precioBase, double porcentajeImportacion) {
        super(propietario, marca, precioBase);
        this.porcentajeImportacion = porcentajeImportacion;
        calcularPreciofinal();
    }

    @Override
    public void calcularPreciofinal() {
        double valorImportacion = precioBase * (porcentajeImportacion / 100);
        double seguroMantenimiento = valorImportacion * 1.5;
        this.precioFinal = precioBase + valorImportacion + seguroMantenimiento;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Tipo: Camioneta\n"
                + "Importación: %.2f%%\n"
                + "Seguro Mantenimiento: %.2f\n"
                + "Precio Final: %.2f", super.toString(), 
                porcentajeImportacion
                , precioBase * 0.015, precioFinal);
        return cadena;
    }
}
