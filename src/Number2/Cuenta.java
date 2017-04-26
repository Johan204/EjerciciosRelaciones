
/*
 * Welcome Master.
 */
package Number2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Johan
 */
public class Cuenta {

    private int numeroCuenta;
    private double saldoCuenta;
    private Date fechaCreacion;
    private String nombreCliente;
 
    private ArrayList<Movimiento> movimientos;

    public Cuenta(int numeroCuenta, double saldoCuenta, Date fechaCreacion, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.fechaCreacion = fechaCreacion;
        this.nombreCliente = nombreCliente;

    }

   

    public void crearMovimientos(Date fechaCreacion, double saldoCuenta, TipoTransaccion tipoTransaccion) {
        this.movimientos = new ArrayList();
        this.movimientos.add(new Movimiento(fechaCreacion, saldoCuenta, tipoTransaccion));
    }

    public void movimientos() {
        for (int i = 0; i < this.movimientos.size(); i++) {
            this.movimientos.get(i).movimientoSegunTipo(4, 2, 4);
            if (this.movimientos.get(i).getTipoTransaccion() == 0) {
                System.out.println("El pago de los salarios de sus empleados\nEl pago a sus proveedores");
                
            }
            

            if (this.movimientos.get(i).getTipoTransaccion() == 1) {
                System.out.println("El pago de los salarios de sus servicios publicos\nEl pago a la administracion");
                
            }
            
        }

    }

    public void imprimirCuenta() {
        System.out.println("Estimado " + this.nombreCliente 
                + "\nSu saldo inicial era de: " + this.movimientos.get(0).getSaldoAnterior() + ", al realizar los siguientes movimientos: ");
        movimientos();
        System.out.println("Su nuevo saldo es de: " + this.movimientos.get(0).checkDinero());
    }

}
