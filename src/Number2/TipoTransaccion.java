/*
 * Welcome Master.
 */
package Number2;

/**
 *
 * @author Johan
 */
public class TipoTransaccion {
    private int tipoTransaccion;

    public TipoTransaccion(int tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public int getTipoTransaccion() {
        return tipoTransaccion;
    }
     public String definirTransaccion() {
        if (this.tipoTransaccion == 0) {
            return "debito";
        } else if (this.tipoTransaccion == 1) {
            return "credito";
        } else {
            return null;
        }
    }
    public void imprimir(){
        System.out.println(definirTransaccion());
    }
   

  
    
    
}
