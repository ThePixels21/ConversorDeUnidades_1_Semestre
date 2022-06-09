package conversordeunidades;

import javax.swing.JOptionPane;
import src.Longitud;
import src.Peso;
import src.Temperatura;
import src.Tiempo;

/**
 *
 * @author ThePixels21
 */
public class ConversorDeUnidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String continuar;
        do {
            short opcion = Short.parseShort(JOptionPane.showInputDialog("CONVERSOR DE "
                + "UNIDADES\n\nIngrese el número de la opción que desea: \n1 - "
                + "Conversión de Longitud\n2 - Conversión de Peso\n3 - Conversión de Temperatura\n4 - Conversion de Tiempo\n"
                    + "5 - Ver tablas de conversión\n6 - Salir"));
        switch (opcion) {
            case 1: //Conversión de longitud
                short unidadLongitud = Short.parseShort(JOptionPane.showInputDialog("CONVERSIÓN DE LONGITUD\n"
                        + "Ingrese el número que corresponde a la unidad en que se encuentra la longitud a convertir\n"
                        + "1 - Metros\n2 - Pies\n3 - Pulgadas\n4 - Centímetros"));
                double medida;
                if(unidadLongitud == 1) {
                    medida = Double.parseDouble(JOptionPane.showInputDialog("CONVERSIÓN DE LONGITUD\n"
                            + "Ingrese el valor de la longitud en metros (sólo se convierten valores iguales o mayores a 1 m)"));
                }else if(unidadLongitud == 2) {
                    medida = Double.parseDouble(JOptionPane.showInputDialog("CONVERSIÓN DE LONGITUD\n"
                            + "Ingrese el valor de la longitud en pies (sólo se convierten valores iguales o mayores a 1 ft)"));
                }else if(unidadLongitud == 3) {
                    medida = Double.parseDouble(JOptionPane.showInputDialog("CONVERSIÓN DE LONGITUD\n"
                            + "Ingrese el valor de la longitud en pulgadas (sólo se convierten valores iguales o mayores a 1 in)"));
                }else if(unidadLongitud == 4) {
                    medida = Double.parseDouble(JOptionPane.showInputDialog("CONVERSIÓN DE LONGITUD\n"
                            + "Ingrese el valor de la longitud en centímetros (sólo se convierten valores iguales o mayores a 1 cm)"));
                }else {
                    JOptionPane.showMessageDialog(null, "Ha ingresado la opción - "+unidadLongitud+" - la cual no es válida. "
                            + "La aplicación se cerrará.");
                    return;
                }
                if(medida < 1) {
                    JOptionPane.showMessageDialog(null, "Lo sentimos, no es posible realizar esta conversión. La aplicación se cerrará.");
                    return;
                }else {
                    Longitud longi = new Longitud(medida, unidadLongitud);
                    String convLong = longi.convertir();
                    JOptionPane.showMessageDialog(null, convLong);
                }
                break;
            case 2: //Conversión de peso
                short unidadPeso = Short.parseShort(JOptionPane.showInputDialog("CONVERSIÓN DE PESO\n"
                        + "Ingrese el número que corresponde a la unidad en que se encuentra el peso a convertir\n"
                        + "1 - Kilogramos\n2 - Libras\n3 - Gramos"));
                double peso;
                if(unidadPeso == 1) {
                    peso = Double.parseDouble(JOptionPane.showInputDialog("CONVERSOR DE PESO\n"
                            + "Ingrese el valor del peso en kilogramos (sólo se convierten valores iguales o mayores a 1 kg)"));
                }else if(unidadPeso == 2) {
                    peso = Double.parseDouble(JOptionPane.showInputDialog("CONVERSOR DE PESO\n"
                            + "Ingrese el valor del peso en libras (sólo se convierten valores iguales o mayores a 1 lb)"));
                }else if(unidadPeso == 3) {
                    peso = Double.parseDouble(JOptionPane.showInputDialog("CONVERSOR DE PESO\n"
                            + "Ingrese el valor del peso en gramos (sólo se convierten valores iguales o mayores a 1 gr)"));
                }else {
                    JOptionPane.showMessageDialog(null, "Ha ingresado la opción - "+unidadPeso+" - la cual no es válida. "
                            + "La aplicación se cerrará.");
                    return;
                }
                if(peso < 1) {
                    JOptionPane.showMessageDialog(null, "Lo sentimos, no es posible realizar esta conversión. La aplicación se cerrará.");
                    return;
                }else {
                    Peso pes = new Peso (peso, unidadPeso);
                    String convPeso = pes.convertir();
                    JOptionPane.showMessageDialog(null, convPeso);
                }
                break;
            case 3: //Conversión de temperatura
                short unidadTemperatura = Short.parseShort(JOptionPane.showInputDialog("CONVERSOR DE TEMPERATURA\n"
                        + "Ingrese el número que corresponde a la unidad en que se encuentra la temperatura a convertir\n"
                        + "1 - Grados Celcius\n2 - Grados Kelvin\n3 - Grados Fahrenheit"));
                double valTemp;
                if(unidadTemperatura == 1) {
                    valTemp = Double.parseDouble(JOptionPane.showInputDialog("CONVERSOR DE TEMPERATURA\n"
                            + "Ingrese el valor de la temperatura en grados Celcius (Se admiten temperaturas bajo 0°)"));
                }else if(unidadTemperatura == 2) {
                    valTemp = Double.parseDouble(JOptionPane.showInputDialog("CONVERSOR DE TEMPERATURA\n"
                            + "Ingrese el valor de la temperatura en grados Kelvin (Se admiten temperaturas bajo 0°)"));
                }else if(unidadTemperatura == 3) {
                    valTemp = Double.parseDouble(JOptionPane.showInputDialog("CONVERSOR DE TEMPERATURA\n"
                            + "Ingrese el valor de la temperatura en grados Fahrenheit (Se admiten temperaturas bajo 0°)"));
                }else {
                    JOptionPane.showMessageDialog(null, "Ha ingresado la opción - "+unidadTemperatura+" - la cual no es válida. "
                            + "La aplicación se cerrará.");
                    return;
                }
                Temperatura temp = new Temperatura(valTemp, unidadTemperatura);
                String convTemp = temp.convertir();
                JOptionPane.showMessageDialog(null, convTemp);
                break;
            case 4://Conversión de tiempo
                short unidadTiempo = Short.parseShort(JOptionPane.showInputDialog("CONVERSOR DE TIEMPO\n"
                        + "Ingrese el número que corresponde a la unidad en que se encuentra la temperatura a convertir\n"
                        + "1 - Minutos\n2 - Segundos\n3 - Horas\n4 - Dias"));
                double tiempo;
                if(unidadTiempo == 1) {
                    tiempo = Double.parseDouble(JOptionPane.showInputDialog("COVERSOR DE TIEMPO\n"
                            + "Ingrese el valor del tiempo en Minutos (sólo se convierten valores iguales o mayores a 1 min)"));
                }else if(unidadTiempo == 2) {
                    tiempo = Double.parseDouble(JOptionPane.showInputDialog("COVERSOR DE TIEMPO\n"
                            + "Ingrese el valor del tiempo en Segundos (sólo se convierten valores iguales o mayores a 1 seg)"));
                }else if(unidadTiempo == 3) {
                    tiempo = Double.parseDouble(JOptionPane.showInputDialog("COVERSOR DE TIEMPO\n"
                            + "Ingrese el valor del tiempo en Horas (sólo se convierten valores iguales o mayores a 1 hr)"));
                }else if(unidadTiempo == 4) {
                    tiempo = Double.parseDouble(JOptionPane.showInputDialog("COVERSOR DE TIEMPO\n"
                            + "Ingrese el valor del tiempo en Días (sólo se convierten valores iguales o mayores a 1 día)"));
                }else {
                    JOptionPane.showMessageDialog(null, "Ha ingresado la opción - "+unidadTiempo+" - la cual no es válida. "
                            + "La aplicación se cerrará.");
                    return;
                }if(tiempo < 1) {
                    JOptionPane.showMessageDialog(null, "Lo sentimos, no es posible realizar esta conversión. La aplicación se cerrará.");
                    return;
                }else {
                    Tiempo tiemp = new Tiempo (tiempo, unidadTiempo);
                    JOptionPane.showMessageDialog(null,tiemp.convertir());
                }
                break;
            case 5: //Tabla de conversión
                short tabla = Short.parseShort(JOptionPane.showInputDialog("CONVERSOR DE UNIDADES\n\n"
                        + "Ingrese el tipo de unidades para generar la tabla: \n1 - Unidades de Longitud\n2 - Unidades de Peso"
                        + "\n3 - Unidades de Temperatura\n4 - Unidad de Tiempo"));
                short cantidad;
                double aumentoNumeros = 1;
                if(tabla == 1) { //Longitud
                    do {
                        cantidad = Short.parseShort(JOptionPane.showInputDialog("Ingrese la cantidad de conversiones de longitud "
                            + "que desea que contenga la tabla\n(El valor inicial de la tabla es de 10 mts si el valor ingresado es mayor a 1)"));
                         if(cantidad < 1 || aumentoNumeros < 1) {
                        JOptionPane.showMessageDialog(null, "Ha ingresado un número menor a 1, el cual no es válido. "
                                + "Ingrese otro valor.");
                        }
                    }while(cantidad < 1 || aumentoNumeros < 1);
                        if(cantidad != 1 && cantidad != 2) {
                            do {
                                aumentoNumeros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número en el que van a "
                                + "aumentar los valores de la tabla"));
                                 if(cantidad < 1 || aumentoNumeros < 1) {
                                    JOptionPane.showMessageDialog(null, "Ha ingresado un número menor a 1, el cual no es válido. "
                                            + "Ingrese otro valor.");
                                }
                            }while(cantidad < 1 || aumentoNumeros < 1);
                        }
                    
                    JOptionPane.showMessageDialog(null, Longitud.tablaLongitud(cantidad, aumentoNumeros));
                }else if(tabla == 2) { //Peso
                    do {
                        cantidad = Short.parseShort(JOptionPane.showInputDialog("Ingrese la cantidad de conversiones de peso "
                            + "que desea que contenga la tabla\n(El valor inicial de la tabla es de 10 kg si el valor ingresado es mayor a 1)"));
                        if(cantidad < 1 || aumentoNumeros < 1) {
                        JOptionPane.showMessageDialog(null, "Ha ingresado un número menor a 1, el cual no es válido. "
                                + "Ingrese otro valor.");
                        }
                    }while(cantidad < 1 || aumentoNumeros < 1);
                    if(cantidad != 1 && cantidad != 2) {
                        do {
                            aumentoNumeros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número en el que van a "
                                + "aumentar los valores de la tabla"));
                            if(cantidad < 1 || aumentoNumeros < 1) {
                                    JOptionPane.showMessageDialog(null, "Ha ingresado un número menor a 1, el cual no es válido. "
                                            + "Ingrese otro valor.");
                            }
                    }while(cantidad < 1 || aumentoNumeros < 1);
                    }
                    JOptionPane.showMessageDialog(null, Peso.tablaPeso(cantidad, aumentoNumeros));
                }else if(tabla == 3) { //Temperatura
                    do {
                        cantidad = Short.parseShort(JOptionPane.showInputDialog("Ingrese la cantidad de conversiones de temperatura "
                            + "que desea que contenga la tabla\n(El valor inicial de la tabla es de -10°C si el valor ingresado es mayor a 1)"));
                        if(cantidad < 1 || aumentoNumeros < 1) {
                                    JOptionPane.showMessageDialog(null, "Ha ingresado un número menor a 1, el cual no es válido. "
                                            + "Ingrese otro valor.");
                        }
                    }while(cantidad < 1 || aumentoNumeros < 1);
                    if(cantidad != 1 && cantidad != 2) {
                            do {
                                aumentoNumeros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número en el que van a "
                                + "aumentar los valores de la tabla"));
                                if(cantidad < 1 || aumentoNumeros < 1) {
                                    JOptionPane.showMessageDialog(null, "Ha ingresado un número menor a 1, el cual no es válido. "
                                            + "Ingrese otro valor.");
                                }
                            }while(cantidad < 1 || aumentoNumeros < 1);
                    }
                    JOptionPane.showMessageDialog(null, Temperatura.tablaTemperatura(cantidad, aumentoNumeros));
                }else if(tabla == 4) { //Tiempo
                    do {
                        cantidad = Short.parseShort(JOptionPane.showInputDialog("Ingrese la cantidad de conversiones de tiempo "
                            + "que desea que contenga la tabla\n(El valor inicial de la tabla es de 10 min si el valor ingresado es mayor a 1)"));
                        if(cantidad < 1 || aumentoNumeros < 1) {
                        JOptionPane.showMessageDialog(null, "Ha ingresado un número menor a 1, el cual no es válido. "
                                + "Ingrese otro valor.");
                        }
                    }while(cantidad < 1 || aumentoNumeros < 1);
                        if(cantidad != 1 && cantidad != 2) {
                            do {
                                aumentoNumeros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número en el que van a "
                                + "aumentar los valores de la tabla"));
                                if(cantidad < 1 || aumentoNumeros < 1) {
                                JOptionPane.showMessageDialog(null, "Ha ingresado un número menor a 1, el cual no es válido. "
                                        + "Ingrese otro valor.");
                                }
                            }while(cantidad < 1 || aumentoNumeros < 1);
                        }
                    JOptionPane.showMessageDialog(null, Tiempo.tablaTiempo(cantidad, aumentoNumeros));
                }else {
                    JOptionPane.showMessageDialog(null, "Ha ingresado la opción - "+tabla+" - la cual no es válida. "
                            + "La aplicación se cerrará.");
                    return;
                }
                break;
            case 6: //Salir
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Ha ingresado la opción - " +opcion+ 
                        " - la cual no es válida. La aplicación se cerrará.");
                return;
        }
        continuar = JOptionPane.showInputDialog("Desea continuar en la aplicación?\nIngrese (SI/NO)");
        }while(continuar.equalsIgnoreCase("si"));
                JOptionPane.showMessageDialog(null, "Program by Pixels21.\nSantiago Quintero Rincón.");
    }
}