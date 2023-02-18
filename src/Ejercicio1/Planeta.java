package Ejercicio1;

/**
 * clase que contiene atrivutos de un planeta
 */
public class Planeta {
    /**
     * identificador unico
     */
    private int id;
    /**
     * distancia del sol en orbitas
     */
    private int distaciaSolOrbitas;
    /**
     * nombre del planeta
     */
    private String nombre;
    /**
     * densidad del planeta
     */
    private final double densidad;
    /**
     * masa del planeta
     */
    private final double masa;
    private final double diametro;

    /**
     *
     * @param id
     * @param distaciaSolOrbitas
     * @param nombre
     * @param densidad
     * @param masa
     * @param diametro
     */
    public Planeta(int id, int distaciaSolOrbitas, String nombre, double densidad, double masa, double diametro) {
        this.id = id;
        this.distaciaSolOrbitas = distaciaSolOrbitas;
        this.nombre = nombre;
        this.densidad = densidad;
        this.masa = masa;
        this.diametro = diametro;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public int getDistaciaSolOrbitas() {
        return distaciaSolOrbitas;
    }

    /**
     *
     * @param distaciaSolOrbitas
     */
    public void setDistaciaSolOrbitas(int distaciaSolOrbitas) {
        this.distaciaSolOrbitas = distaciaSolOrbitas;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public double getDensidad() {
        return densidad;
    }

    /**
     *
     * @return
     */
    public double getMasa() {
        return masa;
    }

    /**
     *
     * @return
     */
    public double getDiametro() {
        return diametro;
    }

    /**
     * funcionalidad que permite calcular el valor de la atraccion gravitacional entre dos cuerpos
     * @param masa1
     * @param masa2
     * @param distancia
     * @return valor de la atraacion gravitacional
     */
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
