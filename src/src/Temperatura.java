package src;

import java.text.DecimalFormat;

/**
 * 
 * @author ThePixels21
 */
public class Temperatura {
    public static final double CELCIUS = 273.15; 
    public static final double VALOR_ECUACION_1 = 1.8; 
    public static final double VALOR_ECUACION_2 = 32;
    
    private double valor;
    private short tipo;

    public Temperatura(double valor, short tipo) {
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
     * Calcula el valor equivalente de temperatura según corresponda
     * Celcius: en Kelvin y Fahrenheit
     * Kelvin: en Celcius y Fahrenheit
     * Fahrenheit: en Celcius y Kelvin
     * @return mensaje con los resultados de la conversión
     */
    public String convertir() {
        DecimalFormat df = new DecimalFormat("0.00");
        String msj = "CONVERSIÓN DE TEMPERATURA\n\n";
        if(tipo == 1) {
            msj += "Temperatura en grados Celcius: " +valor +"\nTemperatura en grados Kelvin: " +df.format(valor+CELCIUS)
                    +"\nTemperatura en grados Fahrenheit: "+df.format((valor*VALOR_ECUACION_1)+VALOR_ECUACION_2);
        }else if(tipo == 2) {
            msj += "Temperatura en grados Kelvin: "+valor +"\nTemperatura en grados Celcius: " +df.format(valor-CELCIUS)
                    +"\nTemperatura en grados Fahrenheit: " +df.format((valor-CELCIUS)*VALOR_ECUACION_1 +VALOR_ECUACION_2);
        }else if(tipo == 3) {
            msj += "Temperatura en grados Fahrenheit: " +valor +"\nTemperatura en grados Celcius: " +df.format(((valor-VALOR_ECUACION_2)*5/9))
                    +"\nTemperatura en grados Kelvin: " +df.format(((valor-VALOR_ECUACION_2)*5/9 + CELCIUS));
        }
        return msj;
    }
    
    /**
     * Calcula el equivalente de la temperatura en Kelvin a gramos y Fahrenheit
     * @param cant cantidad de conversiones que contiene la tabla
     * @param aumento numero en el que van aumentando los valores de la tabla
     * @return tabla con los resultados de las equivalencias hasta cant
     */
    public static String tablaTemperatura(short cant, double aumento) {
        DecimalFormat df = new DecimalFormat("0.00");
        String msj = "UNIDADES DE TEMPERATURA\n\n";
        double celcius = 1;
        msj += celcius +"°C" +" = " +df.format(celcius+CELCIUS) + "°K ; " +df.format((celcius*VALOR_ECUACION_1)+VALOR_ECUACION_2)
                    +"°F\n";
        if(cant > 1) {
            celcius=-10;
            msj += celcius +"°C" +" = " +df.format(celcius+CELCIUS) + "°K ; " +df.format((celcius*VALOR_ECUACION_1)+VALOR_ECUACION_2)
                    +"°F\n";
        }
        if(cant > 2){
            for(int i = 1; i<cant--; i++) {
            celcius += aumento;
            msj += celcius +"°C" +" = " +df.format(celcius+CELCIUS) + "°K ; " +df.format((celcius*VALOR_ECUACION_1)+VALOR_ECUACION_2)
                    +"°F";
            if(i<cant-2) {
                msj += "\n";
            }
            }
        }
        return msj;
    }
}