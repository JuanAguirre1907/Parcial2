public class Pelicula {

    private String nombre;
    private String género;
    private String descripción;
    private double puntuación;

    public Pelicula(String nombre, String género, String descripción, double puntuación) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
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
