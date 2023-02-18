package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(int numeroPasajeros, String tripulacion, int numeroRuedas, Date fechaMatricula, String medioDesplazamientos, int cilindraje) {
        super(numeroPasajeros, tripulacion, numeroRuedas, fechaMatricula, medioDesplazamientos);
        this.cilindraje = cilindraje;
    }
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
