package src;

import java.text.DecimalFormat;

/**
 * 
 * @author ThePixels21
 */
public class Tiempo {
    public static final double SEGUNDO_X_MINUTO=60;
    public static final double MINUTO_X_DIA=1440;
    public static final double SEGUNDO_X_HORA=3600;
    public static final double SEGUNDO_X_DIA=86400;
    public static final double HORA_X_DIA=24;
    
    private double valor;
    private short tipo;

    public Tiempo(double valor, short tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Calcula el valor equivalente del tiempo en varias unidades según corresponda:
     * Minutos: segundos, horas, dias
     * Segundos: minutos, horas, dias
     * Hoas: minutos, segudnos, dias
     * Dias: minutos, segundos, horas
     * @return mensaje con los resultados de la conversión
     */
    public String convertir() {
        DecimalFormat df = new DecimalFormat("0.000");
        String msj = "CONVERSIÓN DE TIEMPO\n\n";
        if(tipo == 1) {
            msj += "Tiempo en minutos: "+valor +"\nTiempo en segundos: " +valor*SEGUNDO_X_MINUTO +"\nTiempo en horas: "
                    +(valor/SEGUNDO_X_MINUTO)+"\nTiempo en dias: "+df.format((valor/MINUTO_X_DIA));
        }else if(tipo == 2) {
            msj += "Tiempo en segundos: "+valor+"\nTiempo en minutos: "+(valor/SEGUNDO_X_MINUTO)+"\nTiempo en horas: "
                    +df.format((valor/SEGUNDO_X_HORA)) +"\nTiempo en dias: "+df.format((valor/SEGUNDO_X_DIA));
        }else if(tipo == 3) {
            msj += "Tiempo en horas: "+valor +"\nTiempo en miutos: "+(valor*SEGUNDO_X_MINUTO) +"\nTiempo en segundos: "
                    +(valor*SEGUNDO_X_HORA) +"\nTiempo en dias: "+(valor/HORA_X_DIA);
        }else {
            msj += "Tiempo en dias: "+valor +"\nTiempo en minutos: "+(valor*MINUTO_X_DIA)+"\nTiempo en segundos: "
                    +(valor*SEGUNDO_X_DIA)+"\nTiempo en horas: "+(valor*HORA_X_DIA);
        }
        return msj;
    }

     /**
     * Calcula el equivalente de la longitud en kilogramos a gramos y libras
     * @param cant cantidad de conversiones que contiene la tabla
     * @param aumento numero en el que van aumentando los valores de la tabla
     * @return tabla con los resultados de las equivalencias hasta cant
     */
    public static String tablaTiempo(short cant, double aumento) {
        DecimalFormat df = new DecimalFormat("0.000");
        String msj = "UNIDADES DE TIEMPO\n\n";
        double min = 1;
         msj += min +" min ; " +(min*SEGUNDO_X_MINUTO) +" seg ; " +df.format(min/SEGUNDO_X_MINUTO) +" hrs ; "
                    +df.format(min/MINUTO_X_DIA) +" dias\n";
         if(cant > 1) {
             min = 10;
             msj += min +" min ; " +(min*SEGUNDO_X_MINUTO) +" seg ; " +df.format(min/SEGUNDO_X_MINUTO) +" hrs ; "
                    +df.format(min/MINUTO_X_DIA) +" dias\n";
         }
         if(cant > 2) {
             for(int i = 1; i<cant--; i++) {
            min += aumento;
            msj += min +" min ; " +(min*SEGUNDO_X_MINUTO) +" seg ; " +df.format(min/SEGUNDO_X_MINUTO) +" hrs ; "
                    +df.format(min/MINUTO_X_DIA) +" dias";
            if(i<cant-2) {
                msj += "\n";
            }
            }
         }
        return msj;
    }
}