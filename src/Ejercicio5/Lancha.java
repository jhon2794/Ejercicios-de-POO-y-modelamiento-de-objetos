package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;
/**
 * clase lancha que es una subclase de vehiculo
 * @author Jhon Gutierrez
 */
public class Lancha extends Vehiculo {
    /**
     * atributo unico de la clase lancha determina el tipo de la misma
     */
    private String tipoLancha;

    /**
     *
     * @param numeroPasajeros
     * @param tripulacion
     * @param numeroRuedas
     * @param fechaMatricula
     * @param medioDesplazamientos
     * @param tipoLancha
     */
    public Lancha(int numeroPasajeros, String tripulacion, int numeroRuedas, Date fechaMatricula, String medioDesplazamientos, String tipoLancha) {
        super(numeroPasajeros, tripulacion, numeroRuedas, fechaMatricula, medioDesplazamientos);
        this.tipoLancha = tipoLancha;
        /**
         * metodo to string permite concatenar vairiables para mostrar con mayor facilidad
         * @return
         */
    }
    @Override
    public String toString() {
        return "Lancha " + "tipo lancha:" + tipoLancha+","+"numeroPasajeros: " +
                ""+getNumeroPasajeros()+","+"num ruedas: " + getNumeroRuedas()+ "," + "tripulacion: " +
                "" +getTripulacion()+","+"fecha:" +
                "" +
                "" +getFechaMatricula()+","+"  medio desplazamiento: " +
                ""+ getMedioDesplazamientos() +".";
    }
}
