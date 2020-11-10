import java.util.Scanner;

public class AdministrarPeliculas {
    Pelicula[] peliculas = new Pelicula[10];
    private Scanner scanner = new Scanner(System.in);

    public void agregar() {
        int posicion = buscarPosicion();

        if (posicion != -1) {
            System.out.println("ingrese el nombre");
            String nombre = scanner.nextLine();
            genero genero = elegirgenero();
            System.out.println("ingrese la descripción");
            String descripción = scanner.nextLine();
            System.out.println("ingrese la puntuación");
            double puntuación = scanner.nextDouble();
            scanner.nextLine();

            peliculas[posicion] = new Pelicula(nombre,genero,descripción,puntuación,posicion+1);
            System.out.println("La pelicula: " + nombre + " ha sido agregada correctamente en la posicion: " + posicion+1);
        } else {
            System.out.println("No hay posiciones disponibles");
        }
    }
    public void eliminar(){

        System.out.println("Que posicion desea eliminar?");
        int posición = scanner.nextInt();

        if(posición >= 1 && posición <= 10) {
            if(peliculas[posición - 1] == null){
                System.out.println("La posicion " + posición + " ya está vacía");
            }else{
                peliculas[posición - 1] = null;
                System.out.println("La pelicula en la posicion " + posición + " ha sido correctamente eliminada");
            }
        }
    }

    public void modificar(){

    }

    public void mostrar(){
        System.out.println("\nLista de peliculas: ");
        for (int i = 0; i < peliculas.length; i++){
            if(peliculas[i] != null) {
                System.out.println(peliculas[i]);
            }
    }

    }
    private int buscarPosicion(){

        for (int i = 0; i < peliculas.length; i++) {

            if(peliculas[i] == null){
            return i;
            }
        }
        return -1;
        }
    private genero elegirgenero(){
        int opcion = 0;
        do {
            System.out.println("elija el genero");
            System.out.println("1. " + genero.AVENTURA);
            System.out.println("2. " + genero.COMEDIA);
            System.out.println("3. " + genero.DRAMA);
            System.out.println("4. " + genero.TERROR);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    return genero.AVENTURA;
                case 2:
                    return genero.COMEDIA;
                case 3:
                    return genero.DRAMA;
                case 4:
                    return genero.TERROR;
                default:
                    System.out.println("Esta opcion no es válida");
                    return null;
            }
        }while (true);
        }
    }
