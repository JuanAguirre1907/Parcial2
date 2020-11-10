public class Pelicula {

    private String nombre;
    private genero género;
    private String descripción;
    private double puntuación;
    private int posicion;

    public Pelicula(String nombre, genero género, String descripción, double puntuación,int posicion) {
        this.nombre = nombre;
        this.género = género;
        this.descripción = descripción;
        this.puntuación = puntuación;
        this.posicion = posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGénero(genero género) {
        this.género = género;
    }

    public genero getGénero() {
        return género;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getDescripción() {
        return descripción;
    }
    
    public void setPuntuación(double puntuación) {
        this.puntuación = puntuación;
    }

    public double getPuntuación() {
        return puntuación;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre:'" + this.nombre + '\'' +
                ", género:'" + this.género + '\'' +
                ", descripción:'" + this.descripción + '\'' +
                ", puntuación:" + this.puntuación +
                '}';
    }
}
