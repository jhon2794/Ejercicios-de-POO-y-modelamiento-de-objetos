package Ejercicio1;

public class Planeta {

    private int id;

    private int distaciaSolOrbitas;

    private String nombre;
    private final double densidad;
    private final double masa;
    private final double diametro;

    public Planeta(int id, int distaciaSolOrbitas, String nombre, double densidad, double masa, double diametro) {
        this.id = id;
        this.distaciaSolOrbitas = distaciaSolOrbitas;
        this.nombre = nombre;
        this.densidad = densidad;
        this.masa = masa;
        this.diametro = diametro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistaciaSolOrbitas() {
        return distaciaSolOrbitas;
    }

    public void setDistaciaSolOrbitas(int distaciaSolOrbitas) {
        this.distaciaSolOrbitas = distaciaSolOrbitas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDensidad() {
        return densidad;
    }

    public double getMasa() {
        return masa;
    }

    public double getDiametro() {
        return diametro;
    }

    public double calcularAtracciónGravitatoria(double masa1, double masa2, double distancia){
        double G = 6.67*(Math.pow(10,-11));
        double F = 0;
        
        if (distancia > 0) {
            F = (G) * (masa1) * (masa2) / (Math.pow(distancia, 2));
        }else{
            throw new IllegalArgumentException("dato invalido");
        }
        return F;

    }
}
