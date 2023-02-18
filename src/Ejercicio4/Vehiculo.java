package Ejercicio4;

import Ejercicio5.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Vehiculo {
    private  int numeroPasajeros;
     private String tripulacion;
     private  int numeroRuedas;
     private Date fechaMatricula;
     private String medioDesplazamientos;
    public Vehiculo(int numeroPasajeros, String tripulacion, int numeroRuedas, Date fechaMatricula, String medioDesplazamientos) {
        this.numeroPasajeros = numeroPasajeros;
        this.tripulacion = tripulacion;
        this.numeroRuedas = numeroRuedas;
        this.fechaMatricula = fechaMatricula;
        this.medioDesplazamientos = medioDesplazamientos;

    }
    public Vehiculo(){

    }
    public void crearVehiculo() throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese numero de pasajeros");
            numeroPasajeros = Integer.valueOf(sc.nextLine());
            System.out.println("ingrese si, si tiene tripulcaion o no,si no tiene  tripulacion");
            String tripulacion = String.valueOf(sc.nextLine());
            System.out.println("ingrese numero de ruedas");
            numeroRuedas = Integer.valueOf(sc.nextLine());
            System.out.println("ingrese medio desplazamiento");
            medioDesplazamientos = String.valueOf(sc.nextLine());
            System.out.println("Introduzca la fecha de matricula con formato dd/mm/yyyy");
            String fecha = String.valueOf(sc.nextLine());
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date dato = df.parse(fecha);
            Vehiculo vehiculo = new Vehiculo(numeroPasajeros, tripulacion, numeroRuedas,dato, medioDesplazamientos);
            vehiculos.add(vehiculo);
            System.out.println("agregado");
        }
        for (int i = 0; i < vehiculos.size(); i++){
           System.out.println(vehiculos.get(i).toString());
        }

    }

    public void crearDistintosTiposDeVehiculo() throws ParseException {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int i = 0;
       while (i < 5){
           String fecha;
           Date dato = null;
           SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
           System.out.println("ingrese 1 para crear una bicliclta,  2 para crear un coche, 3 para crear camion, 4 para crear  moto , 5 para crear lancha");
           int  response = Integer.valueOf(sc.nextLine());
           switch (response) {
               case 1:
                   System.out.println("ingrese numero de pasajeros");
                   numeroPasajeros = Integer.valueOf(sc.nextLine());
                   System.out.println("ingrese si, si tiene tripulcaion o no,si no tiene  tripulacion");
                   tripulacion = String.valueOf(sc.nextLine());
                   System.out.println("ingrese numero de ruedas");
                   numeroRuedas = Integer.valueOf(sc.nextLine());
                   System.out.println("ingrese medio desplazamiento");
                   medioDesplazamientos = String.valueOf(sc.nextLine());
                   System.out.println("Introduzca la fecha de matricula con formato dd/mm/yyyy");
                   fecha = String.valueOf(sc.nextLine());
                   System.out.println("indique si es tipo kros o todoterreno");
                   String tipoBicleta = String.valueOf(sc.nextLine());
                   dato = df.parse(fecha);
                   Vehiculo bicicleta = new Biclicleta(numeroPasajeros, tripulacion, numeroRuedas,dato, medioDesplazamientos,tipoBicleta);
                   vehiculos.add(bicicleta);
                   System.out.println("agregado");
                   break;
               case 2:
                   System.out.println("ingrese numero de pasajeros");
                   numeroPasajeros = Integer.valueOf(sc.nextLine());
                   System.out.println("ingrese si, si tiene tripulcaion o no,si no tiene  tripulacion");
                   tripulacion = String.valueOf(sc.nextLine());
                   System.out.println("ingrese numero de ruedas");
                   numeroRuedas = Integer.valueOf(sc.nextLine());
                   System.out.println("ingrese medio desplazamiento");
                   medioDesplazamientos = String.valueOf(sc.nextLine());
                   System.out.println("Introduzca la fecha de matricula con formato dd/mm/yyyy");
                   fecha = String.valueOf(sc.nextLine());
                   dato = df.parse(fecha);
                   System.out.println("Introduzca el numero de puertas");
                   int numeroPuertas =  Integer.valueOf(sc.nextLine());
                   Vehiculo coche = new Coche(numeroPasajeros, tripulacion, numeroRuedas,dato, medioDesplazamientos,numeroPuertas);
                   vehiculos.add(coche);
                   System.out.println("agregado");
                   break;
               case 3:
                   System.out.println("ingrese numero de pasajeros");
                   numeroPasajeros = Integer.valueOf(sc.nextLine());
                   System.out.println("ingrese si, si tiene tripulcaion o no,si no tiene  tripulacion");
                   tripulacion = String.valueOf(sc.nextLine());
                   System.out.println("ingrese numero de ruedas");
                   numeroRuedas = Integer.valueOf(sc.nextLine());
                   System.out.println("ingrese medio desplazamiento");
                   medioDesplazamientos = String.valueOf(sc.nextLine());
                   System.out.println("Introduzca la fecha de matricula con formato dd/mm/yyyy");
                   fecha = String.valueOf(sc.nextLine());
                   dato = df.parse(fecha);
                   System.out.println("Introduzca altura");
                   int altura =  Integer.valueOf(sc.nextLine());
                   Vehiculo camion = new Camion(numeroPasajeros, tripulacion, numeroRuedas,dato, medioDesplazamientos,altura);
                   vehiculos.add(camion);
                   System.out.println("agregado");
                   break;
               case 4:
                   System.out.println("ingrese numero de pasajeros");
                   numeroPasajeros = Integer.valueOf(sc.nextLine());
                   System.out.println("ingrese si, si tiene tripulcaion o no,si no tiene  tripulacion");
                   tripulacion = String.valueOf(sc.nextLine());
                   System.out.println("ingrese numero de ruedas");
                   numeroRuedas = Integer.valueOf(sc.nextLine());
                   System.out.println("ingrese medio desplazamiento");
                   medioDesplazamientos = String.valueOf(sc.nextLine());
                   System.out.println("Introduzca la fecha de matricula con formato dd/mm/yyyy");
                   fecha = String.valueOf(sc.nextLine());
                   dato = df.parse(fecha);
                   System.out.println("Introduzca numero del cilindraje");
                   int cilindraje =  Integer.valueOf(sc.nextLine());
                   Vehiculo moto = new Moto(numeroPasajeros, tripulacion, numeroRuedas,dato, medioDesplazamientos,cilindraje);
                   vehiculos.add(moto);
                   System.out.println("agregado");
                   break;
               case 5:
                   System.out.println("ingrese numero de pasajeros");
                   numeroPasajeros = Integer.valueOf(sc.nextLine());
                   System.out.println("ingrese si, si tiene tripulcaion o no,si no tiene  tripulacion");
                   tripulacion = String.valueOf(sc.nextLine());
                   System.out.println("ingrese numero de ruedas");
                   numeroRuedas = Integer.valueOf(sc.nextLine());
                   System.out.println("ingrese medio desplazamiento");
                   medioDesplazamientos = String.valueOf(sc.nextLine());
                   System.out.println("Introduzca la fecha de matricula con formato dd/mm/yyyy");
                   fecha = String.valueOf(sc.nextLine());
                   dato = df.parse(fecha);
                   System.out.println("introduzca motorizada, si es motorizada o velasRemo, si es de las y remo");
                   String tipolancha = String.valueOf(sc.nextLine());
                   Vehiculo lancha = new Lancha(numeroPasajeros, tripulacion, numeroRuedas,dato, medioDesplazamientos,tipolancha);
                   vehiculos.add(lancha);
                   System.out.println("agregado");
                   break;
           }
           i++;
       }
        for (int j = 0; j < vehiculos.size(); j++){
            System.out.println(vehiculos.get(j).toString());
        }
    }
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(String tripulacion) {
        this.tripulacion = tripulacion;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getMedioDesplazamientos() {
        return medioDesplazamientos;
    }

    public void setMedioDesplazamientos(String medioDesplazamientos) {
        this.medioDesplazamientos = medioDesplazamientos;
    }
    @Override
    public String toString() {
        return "numeroPasajeros: " +
        ""+numeroPasajeros+","+"num ruedas: " + numeroRuedas + "," + "tripulacion: " +
                "" +tripulacion+","+"fecha:" +
                "" +
                "" +fechaMatricula+ ","+"  medio desplazamiento: " +
                ""+ medioDesplazamientos +".";
    }
}

