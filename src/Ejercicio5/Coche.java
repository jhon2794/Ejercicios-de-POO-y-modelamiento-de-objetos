package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;

public class Coche extends Vehiculo {
private int tipoDeCoche;

    public Coche(int numeroPasajeros, String tripulacion, int numeroRuedas, Date fechaMatricula, String medioDesplazamientos, int tipoDeCoche) {
        super(numeroPasajeros, tripulacion, numeroRuedas, fechaMatricula, medioDesplazamientos);
        this.tipoDeCoche = tipoDeCoche;
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
