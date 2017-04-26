/*
 * Welcome Master.
 */
package Number2;

import java.util.Date;

/**
 *
 * @author Johan
 */
public class Movimiento {

    private Date fecha;
    private double saldoAnterior;
    private double saldoActual;
    private TipoTransaccion tipoTransaccion;

    public Movimiento(Date fecha, double saldoActual, TipoTransaccion tipoTransaccion) {
        this.fecha = fecha;
        this.saldoAnterior = saldoActual;
        this.saldoActual = saldoActual;
        this.tipoTransaccion = tipoTransaccion;
    }

    public void movimientoSegunTipo(int cantidadSalarios, int cantidadProveedores, int cantidadServicios) {
        if (this.tipoTransaccion.getTipoTransaccion() == 0) {
            pagoSalarios(cantidadSalarios);
            pagoProveedores(cantidadProveedores);
        } else if (this.tipoTransaccion.getTipoTransaccion() == 1) {
            pagoServiciosPublicos(cantidadServicios);
            pagoAdministracion();
        }

    }

    public void pagoSalarios(int cantidadSalarios) {
        double salario = 1500000;
        this.saldoActual = this.saldoActual - (salario * cantidadSalarios);

    }

    public void pagoProveedores(int cantidadProveedores) {
        double precios = 800000;
        this.saldoActual = this.saldoActual - (precios * cantidadProveedores);
    }

    public void pagoServiciosPublicos(int cantidadServicios) {
        double costoServicio = 90000;
        this.saldoActual = this.saldoActual - (costoServicio * cantidadServicios);
    }

    public void pagoAdministracion() {
        double costoAdministracion = 900000;
        this.saldoActual = this.saldoActual - costoAdministracion;
    }

    public double checkDinero() {
        return this.saldoActual;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public int getTipoTransaccion() {
        return tipoTransaccion.getTipoTransaccion();
    }

   

}
