public class Pelicula {

    private String nombre;
    private genero género;
    private String descripción;
    private double puntuación;
    private double posicion;

    public Pelicula(String nombre, genero género, String descripción, double puntuación,double posicion) {
        this.nombre = nombre;
        this.género = género;
        this.descripción = descripción;
        this.puntuación = puntuación;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public genero getGénero() {
        return género;
    }

    public void setGénero(genero género) {
        this.género = género;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getPuntuación() {
        return puntuación;
    }

    public void setPuntuación(double puntuación) {
        this.puntuación = puntuación;
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
