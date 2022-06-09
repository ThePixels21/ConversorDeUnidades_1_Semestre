package src;

import java.text.DecimalFormat;

/**
 *
 * @author ThePixels21
 */
public class Peso {
    
    public static final double LB_X_KG= 2; //Libras por kilogramo
    public static final double GR_X_KG= 1000; //Gramos por kilogramo
    public static final double GR_X_LIBRA = 500; //Gramos por libra
    
    private double valor;
    private short tipo; //1 si el peso está en kilogramos, 2 si está en libras,
    //3 si está en gramos

    public Peso(double valor, short tipo) {
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
     * Calcula el valor equivalente del peso en varias unidades según corresponda:
     * Kilogramo: en libras y gramos
     * Libras: en kilogramos y gramos
     * Gramos: en kilogramos y libras
     * @return mensaje con los resultados de la conversión
     */
    public String convertir(){
        String mensaje = "CONVERSIÓN DE PESO\n\n";
        if(tipo == 1) {
            mensaje += "Peso en kilogramos: "+valor+"\nPeso en gramos: "+valor*GR_X_KG+"\nPeso en libras: "+valor*LB_X_KG;
        }else if(tipo == 2) {
            mensaje += "Peso en libras: "+valor+"\nPeso en kilogramos: "+valor/LB_X_KG+"\nPeso en gramos: "+valor*GR_X_LIBRA;
        }else {
            mensaje += "Peso en gramos: "+valor+"\nPeso en kilogramos: "+valor/GR_X_KG+"\nPeso en libras: "+valor/GR_X_LIBRA;
        }
        return mensaje;
    }
    
    /**
     * Calcula el equivalente de la longitud en kilogramos a gramos y libras
     * @param cant cantidad de conversiones que contiene la tabla
     * @param aumento numero en el que van aumentando los valores de la tabla
     * @return tabla con los resultados de las equivalencias hasta cant
     */
    public static String tablaPeso(short cant, double aumento) {
        DecimalFormat df = new DecimalFormat("0");
        String msj = "UNIDADES DE PESO\n\n";
        double kg = 1;
        msj += df.format(kg) +" kg" +" = " +df.format(kg*GR_X_KG) +" gr ; " +df.format(kg*LB_X_KG) +" lb\n";
        if(cant > 1) {
            kg = 10;
            msj += df.format(kg) +" kg" +" = " +df.format(kg*GR_X_KG) +" gr ; " +df.format(kg*LB_X_KG) +" lb\n";
        }
        if(cant > 2) {
            for(int i = 1; i<cant--; i++) {
            kg += aumento;
            msj += df.format(kg) +" kg" +" = " +df.format(kg*GR_X_KG) +" gr ; " +df.format(kg*LB_X_KG) +" lb";
            if(i<cant-2) {
                msj += "\n";
            }
            }
        }
        return msj;
    }
}