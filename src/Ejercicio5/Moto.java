package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;
/**
 * clase moto que es una subclase de vehiculo
 * @author Jhon Gutierrez
 */
public class Moto extends Vehiculo {
    /**
     * atributo unico de la clase moto determina el cilindraje de la misma
     */
    private int cilindraje;

    /**
     *
     * @param numeroPasajeros
     * @param tripulacion
     * @param numeroRuedas
     * @param fechaMatricula
     * @param medioDesplazamientos
     * @param cilindraje
     */
    public Moto(int numeroPasajeros, String tripulacion, int numeroRuedas, Date fechaMatricula, String medioDesplazamientos, int cilindraje) {
        super(numeroPasajeros, tripulacion, numeroRuedas, fechaMatricula, medioDesplazamientos);
        this.cilindraje = cilindraje;
    }
    /**
     * metodo to string permite concatenar vairiables para mostrar con mayor facilidad
     * @return
     */
    @Override
    public String toString() {
        return "Moto " + "cilindraje:" + cilindraje+","+"numeroPasajeros: " +
                ""+getNumeroPasajeros()+","+"num ruedas: " + getNumeroRuedas()+ "," + "tripulacion: " +
                "" +getTripulacion()+","+"fecha:" +
                "" +
                "" +getFechaMatricula()+","+"  medio desplazamiento: " +
                ""+ getMedioDesplazamientos() +".";
    }
}
