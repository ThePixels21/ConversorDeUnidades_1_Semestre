package src;

import java.text.DecimalFormat;

/**
 *
 * @author ThePixels21
 */
public class Longitud {

    public static final double CM_X_MT = 100; //Centímetros por metro
    public static final double CM_X_PULG = 2.54; //Centímetros por pulgada
    public static final double CM_X_PIE = 30.48; //Centímetros por pie
    public static final double PULG_X_MT = 39.37; // Pulgadas por metro
    public static final double PIES_X_MT = 3.281; // Pies por metro
    public static final double PULG_X_PIE = 12; // Pulgadas por pie

    private double valor;
    private short tipo; //1 si la longitud a convertir está en metros, 2 si está 
    //en pies, 3 si está en pulgadas, 4 si está en centímetros

    public Longitud(double valor, short tipo) {
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
     * Calcula el valor equivalente de la longitud en varias unidades según
     * corresponda: 
     * Metros: en centímetros, pies y pulgadas Pies: en centímetros
     * Pulgadas: en pies Centímetros: en metros, pies y pulgadas si su valor el
     * mayor o igual que 100
     * @return mensaje con los resultados de la conversión
     */
    public String convertir() {
        DecimalFormat df = new DecimalFormat("0.00");
        String mensaje = "CONVERSIÓN DE LONGITUD\n\n";
        if(tipo == 1) {
            mensaje += "Longitud en metros: "+valor+ "\nLongitud en centímetros: "+valor*CM_X_MT
                    +"\nLongitud en pies: "+df.format(valor*PIES_X_MT)+ "\nLongitud en pulgadas: "+df.format(valor*PULG_X_MT);
        }else if(tipo == 2) {
            mensaje += "Longitud en pies: "+valor+ "\nLongitud en metros: "+df.format(valor/PIES_X_MT)+"\nLongitud en centímetros: "
                    +df.format(valor*CM_X_PIE)+ "\nLongitud en pulgadas: "+valor*PULG_X_PIE;
        }else if(tipo == 3) {
            mensaje += "Longitud en pulgadas: "+valor+ "\nLongitud en metros: "+df.format(valor/PULG_X_MT)
                    +"\nLongitud en centímetros: "+df.format(valor*CM_X_PULG)+"\nLongitud en pies: "+df.format(valor/PULG_X_PIE);
        }else {
            mensaje += "Longitud en centímetros: "+valor+"\nLongitud en metros: "+valor/CM_X_MT
                    +"\nLongitud en pies: "+df.format(valor/CM_X_PIE)+"\nLongitud en pulgadas: "+df.format(valor/CM_X_PULG);
        }
        return mensaje;
    }
    
    /**
     * Calcula el equivalente de la longitud en metros a centímetros, pies y pulgadas
     * @param cant cantidad de conversiones que contiene la tabla
     * @param aumento numero en el que van aumentando los valores de la tabla
     * @return tabla con los resultados de las equivalencias hasta cant
     */
    public static String tablaLongitud(short cant, double aumento) {
        DecimalFormat df = new DecimalFormat("0.00");
        String msj = "UNIDADES DE LONGITUD\n\n";
        double mts = 1;
        msj += mts +" mt" + " = "+mts*CM_X_MT +" cm ; " +df.format(mts*PIES_X_MT) +" ft ; "
                   +df.format(mts*PULG_X_MT) +" inch\n";
        if(cant>1) {
            mts = 10;
            msj += mts +" mt" + " = "+mts*CM_X_MT +" cm ; " +df.format(mts*PIES_X_MT) +" ft ; "
                   +df.format(mts*PULG_X_MT) +" inch\n";
        }
        if(cant > 2) {
             for(int i = 1; i<cant--; i++){
                mts += aumento;
                msj += mts +" mt" + " = "+mts*CM_X_MT +" cm ; " +df.format(mts*PIES_X_MT) +" ft ; "
                   +df.format(mts*PULG_X_MT) +" inch";
                if(i<cant-2){
                msj += "\n";
            }
            }
        }
        return msj;
    }
}