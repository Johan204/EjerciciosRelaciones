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
public class Number2Run {
    public static void main(String[] arg){
        TipoTransaccion transaccionDebito = new TipoTransaccion(0);
        TipoTransaccion transaccionCredito = new TipoTransaccion(1);  //0 para debito, 1 para credito
        ArrayList<TipoTransaccion> tipos = new ArrayList();
        tipos.add(transaccionDebito);
        tipos.add(transaccionCredito);
        Date date = new Date(2017, 4, 4); //???????
        Cuenta cuenta_1 = new Cuenta(195849, 38000000, date, "Carlos Jimenez");
        Cuenta cuenta_2 = new Cuenta(684915,36000000, date, "Cristina Kuskov");
        cuenta_1.crearMovimientos(date, 38000000, transaccionDebito);
        cuenta_2.crearMovimientos(date, 56000000, transaccionCredito);
        ArrayList<Cuenta> cuentas = new ArrayList();
        cuentas.add(cuenta_1);
        cuentas.add(cuenta_2);
        Banco banco = new Banco(cuentas, tipos);
//        for (int i = 0; i < 2; i++) {
//            tipos.get(i).imprimir();
//        }
        banco.imprimir();
    }
}
