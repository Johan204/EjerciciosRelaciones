/*
 * Welcome Master.
 */
package Number3;

/**
 *
 * @author Johan
 */
public class Number3RUN {

    public static void main(String[] args) {
        Dia[] dias = new Dia[3]; //Cambiar tamaño de memoria si se desea añadir más dias
        Dia lunes = new Dia(18, "lunes", "Charla_TED");
        lunes.adicionarEvento("Charla_Microsoft");
        Segmento horario1 = new Segmento(8, 11);
        Segmento horario2 = new Segmento(12, 14);
        lunes.adicionarSegmento(horario1);
        lunes.adicionarSegmento(horario2);
        Dia martes = new Dia(19, "martes", "Charla_Huellas_Que_Inspiran");
        martes.adicionarEvento("Charla_UNAL");
        Segmento horario3 = new Segmento(10, 14);
        Segmento horario4 = new Segmento(14, 16);
        martes.adicionarSegmento(horario3);
        martes.adicionarSegmento(horario4);
        Dia miercoles = new Dia(20, "miercoles", "Charla_Computacional");
        miercoles.adicionarEvento("Charla_Espacial");
        Segmento horario5 = new Segmento(8, 13);
        Segmento horario6 = new Segmento(14, 16);
        miercoles.adicionarSegmento(horario5);
        miercoles.adicionarSegmento(horario6);
        dias[0] = lunes;
        dias[1] = martes;
        dias[2] = miercoles;
        Semana semana1 = new Semana(1);
        semana1.adicionarDia(dias);
        Sala sala1 = new Sala("A");
        sala1.adicionarSemana(semana1);
        Dia[] dias_2 = new Dia[3];
        Dia lunes_2 = new Dia(5, "lunes", "Charla_SENA");
        lunes_2.adicionarEvento("Charla_UIS");
        Segmento horario1_2 = new Segmento(10, 11);
        Segmento horario2_2 = new Segmento(12, 14);
        lunes_2.adicionarSegmento(horario1_2);
        lunes_2.adicionarSegmento(horario2_2);
        Dia martes_2 = new Dia(6, "martes", "Charla_Bogota_Mejor");
        martes_2.adicionarEvento("Charla_OOP");
        Segmento horario3_2 = new Segmento(8, 14);
        Segmento horario4_2 = new Segmento(14, 16);
        martes_2.adicionarSegmento(horario3_2);
        martes_2.adicionarSegmento(horario4_2);
        Dia miercoles_2 = new Dia(7, "miercoles", "Charla_Robotica");
        miercoles_2.adicionarEvento("Charla_Bill_Gates");
        Segmento horario5_2 = new Segmento(8, 11);
        Segmento horario6_2 = new Segmento(14, 17);
        miercoles_2.adicionarSegmento(horario5_2);
        miercoles_2.adicionarSegmento(horario6_2);
        dias_2[0] = lunes_2;
        dias_2[1] = martes_2;
        dias_2[2] = miercoles_2;

        Semana semana2 = new Semana(2);
        semana2.adicionarDia(dias_2);
        sala1.adicionarSemana(semana2);
        Sala sala2 = new Sala("B");
        Semana semana3 = new Semana(3);
        Semana semana4 = new Semana(4);
        Dia[] dias_3 = new Dia[3]; //Cambiar tamaño de memoria si se desea añadir más dias
        Dia lunes_3 = new Dia(1, "lunes", "Charla_Comercial");
        lunes_3.adicionarEvento("Charla_Micromercado");
        Segmento horario1_3 = new Segmento(8, 10);
        Segmento horario2_3 = new Segmento(12, 14);
        lunes_3.adicionarSegmento(horario1_3);
        lunes_3.adicionarSegmento(horario2_3);
        Dia martes_3 = new Dia(2, "martes", "Charla_Astronomia");
        martes_3.adicionarEvento("Charla_Buhos");
        Segmento horario3_3 = new Segmento(10, 12);
        Segmento horario4_3 = new Segmento(14, 16);
        martes_3.adicionarSegmento(horario3_3);
        martes_3.adicionarSegmento(horario4_3);
        Dia miercoles_3 = new Dia(3, "miercoles", "Charla_Circuitos");
        miercoles_3.adicionarEvento("Charla_Extrasensorial");
        Segmento horario5_3 = new Segmento(8, 12);
        Segmento horario6_3 = new Segmento(14, 16);
        miercoles_3.adicionarSegmento(horario5_3);
        miercoles_3.adicionarSegmento(horario6_3);
        dias_3[0] = lunes_3;
        dias_3[1] = martes_3;
        dias_3[2] = miercoles_3;
        
        semana3.adicionarDia(dias_3);
        sala2.adicionarSemana(semana3);
        
        Dia[] dias_4 = new Dia[3];
        Dia lunes_4 = new Dia(10, "lunes", "Charla_Samsung");
        lunes_4.adicionarEvento("Charla_Julio_Garavito");
        Segmento horario1_4 = new Segmento(10, 13);
        Segmento horario2_4 = new Segmento(14, 17);
        lunes_4.adicionarSegmento(horario1_4);
        lunes_4.adicionarSegmento(horario2_4);
        Dia martes_4 = new Dia(11, "martes", "Charla_Colombia");
        martes_4.adicionarEvento("Charla_SuperClass");
        Segmento horario3_4 = new Segmento(8, 12);
        Segmento horario4_4 = new Segmento(14, 16);
        martes_4.adicionarSegmento(horario3_4);
        martes_4.adicionarSegmento(horario4_4);
        Dia miercoles_4 = new Dia(12, "miercoles", "Charla_Alemana");
        miercoles_4.adicionarEvento("Charla_Millonaria");
        Segmento horario5_4 = new Segmento(8, 10);
        Segmento horario6_4 = new Segmento(14, 16);
        miercoles_4.adicionarSegmento(horario5_4);
        miercoles_4.adicionarSegmento(horario6_4);
        dias_4[0] = lunes_4;
        dias_4[1] = martes_4;
        dias_4[2] = miercoles_4;
        Programacion listado = new Programacion();
        semana4.adicionarDia(dias_4);
        sala2.adicionarSemana(semana4);
        listado.adicionarSalas(sala1);
        listado.adicionarSalas(sala2);
        listado.listarProgramacion();
    }
}
