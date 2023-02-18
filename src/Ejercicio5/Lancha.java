package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;

public class Lancha extends Vehiculo {
    private String tipoLancha;

    public Lancha(int numeroPasajeros, String tripulacion, int numeroRuedas, Date fechaMatricula, String medioDesplazamientos, String tipoLancha) {
        super(numeroPasajeros, tripulacion, numeroRuedas, fechaMatricula, medioDesplazamientos);
        this.tipoLancha = tipoLancha;
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
