package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;

public class Biclicleta extends Vehiculo {
private String tipoBicleta;

    public Biclicleta(int numeroPasajeros, String tripulacion, int numeroRuedas, Date fechaMatricula, String medioDesplazamientos, String tipoBicleta) {
        super(numeroPasajeros, tripulacion, numeroRuedas, fechaMatricula, medioDesplazamientos);
        this.tipoBicleta = tipoBicleta;
    }
    @Override
    public String toString() {
        return "Bicicleta " + "tipo bicicleta:" + tipoBicleta+","+"numeroPasajeros: " +
                ""+getNumeroPasajeros()+","+"num ruedas: " + getNumeroRuedas()+ "," + "tripulacion: " +
                "" +getTripulacion()+","+"fecha:" +
                "" +
                "" +getFechaMatricula()+","+"  medio desplazamiento: " +
                ""+ getMedioDesplazamientos() +".";
    }

}
