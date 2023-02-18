package Ejercicio5;
import Ejercicio4.Vehiculo;
import java.util.Date;

/**
 * clase bicicleta que es una subclase de vehiculo
 * @author Jhon Gutierrez
 */
public class Biclicleta extends Vehiculo {
    /**
     * atributo unico de la clase bisicleta que indica que tipo de bicileta es
     */
    private String tipoBicleta;

    /**
     *
     * @param numeroPasajeros
     * @param tripulacion
     * @param numeroRuedas
     * @param fechaMatricula
     * @param medioDesplazamientos
     * @param tipoBicleta
     */
    public Biclicleta(int numeroPasajeros, String tripulacion, int numeroRuedas, Date fechaMatricula, String medioDesplazamientos, String tipoBicleta) {
        super(numeroPasajeros, tripulacion, numeroRuedas, fechaMatricula, medioDesplazamientos);
        this.tipoBicleta = tipoBicleta;
    }

    /**
     * metodo to string permite concatenar vairiables para mostrar con mayor facilidad
     * @return
     */
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
