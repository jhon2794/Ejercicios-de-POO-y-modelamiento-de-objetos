package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;

/**
 * clase camion que es una subclase de vehiculo
 * @author Jhon Gutierrez
 */
public class Camion extends Vehiculo {
    /**
     * atributo unico de la clase camion determina la altura del mismo
     */
    private int altura;

    public Camion(int numeroPasajeros, String tripulacion, int numeroRuedas, Date fechaMatricula, String medioDesplazamientos, int altura) {
        super(numeroPasajeros, tripulacion, numeroRuedas, fechaMatricula, medioDesplazamientos);
        this.altura = altura;
    }
    /**
     * metodo to string permite concatenar vairiables para mostrar con mayor facilidad
     * @return
     */
    @Override
    public String toString() {
        return "Camion " + "altura:" + altura+","+"numeroPasajeros: " +
                ""+getNumeroPasajeros()+","+"num ruedas: " + getNumeroRuedas()+ "," + "tripulacion: " +
                "" +getTripulacion()+","+"fecha:" +
                "" +
                "" +getFechaMatricula()+","+"  medio desplazamiento: " +
                ""+ getMedioDesplazamientos() +".";
    }
}
