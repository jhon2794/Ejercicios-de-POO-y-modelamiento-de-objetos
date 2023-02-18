package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;
/**
 * clase coche que es una subclase de vehiculo
 * @author Jhon Gutierrez
 */
public class Coche extends Vehiculo {
    /**
     * atributo unico de la clase coche  determina el tipo del mismo
     */
    private int tipoDeCoche;

    /**
     *
     * @param numeroPasajeros
     * @param tripulacion
     * @param numeroRuedas
     * @param fechaMatricula
     * @param medioDesplazamientos
     * @param tipoDeCoche
     */
    public Coche(int numeroPasajeros, String tripulacion, int numeroRuedas, Date fechaMatricula, String medioDesplazamientos, int tipoDeCoche) {
        super(numeroPasajeros, tripulacion, numeroRuedas, fechaMatricula, medioDesplazamientos);
        this.tipoDeCoche = tipoDeCoche;
        /**
         * metodo to string permite concatenar vairiables para mostrar con mayor facilidad
         * @return
         */
    }
    @Override
    public String toString() {
        return "coche " + "tipo coche:" + tipoDeCoche+","+"numeroPasajeros: " +
                ""+getNumeroPasajeros()+","+"num ruedas: " + getNumeroRuedas()+ "," + "tripulacion: " +
                "" +getTripulacion()+","+"fecha:" +
                "" +
                "" +getFechaMatricula()+","+"  medio desplazamiento: " +
                ""+ getMedioDesplazamientos() +".";
    }
}
