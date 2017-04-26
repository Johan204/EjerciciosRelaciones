package Number4;

import java.util.Scanner;

/**
 *
 * @author Johan
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namesDay[] = { "Domingo","Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        String namesMonths[] = {"","Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.print("Bienvenido, por favor ingrese su nombre: ");
        Person persona = new Person(input.next());
        int dia;
        int mes;
        System.out.println("Estimado " + persona.getFullName() + ", ahora introduzca su fecha de nacimiento\nPrimero el dia,"
                + " despues el mes y por ultimo el año:");
        dia = input.nextInt();
        if (dia <= 0 || dia > 31) {

            do {
                System.out.print("error, introduzca un dia valido: ");
                dia = input.nextInt();

            } while (dia <= 0 || dia > 31);
        }
        mes = input.nextInt();
        if (mes <= 0 || mes > 12) {

            do {
                System.out.print("error, introduzca un mes valido: ");
                mes = input.nextInt();

            } while (mes < 0 || mes > 12);
        }
        Date datos = new Date(dia, mes, input.nextInt(), namesDay, namesMonths);
        System.out.print(persona.getFullName()+", su fecha de nacimiento es el dia: "+datos.getDay()+" ("
                +datos.getNamesDays(datos.defDia())+"),"+" del mes: "+datos.getMonth()+" ("+datos.getNamesMonths()+")"
        +", del año: "+datos.getYear()+"\nEl cual ");
        datos.imprimir();
    }

}
