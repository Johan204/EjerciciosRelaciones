/*
 * Welcome Master.
 */
package Number2;

import java.util.ArrayList;

/**
 *
 * @author Johan
 */
public class Banco {
    private ArrayList<Cuenta> cuentas;
    private ArrayList<TipoTransaccion> tipos; 

    public Banco(ArrayList<Cuenta> cuentas, ArrayList<TipoTransaccion> tipos) {
        this.cuentas = cuentas;
        this.tipos = tipos;
    }
    public void imprimir(){
        for (int i = 0; i < cuentas.size(); i++) {
            cuentas.get(i).imprimirCuenta();
            System.out.print("Su tipo de transacción es: " );
             tipos.get(i).imprimir();
        }
    }
    
    
    
}
