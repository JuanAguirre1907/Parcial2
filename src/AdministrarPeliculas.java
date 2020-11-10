import java.util.Scanner;

public class AdministrarPeliculas {
    Pelicula[] peliculas = new Pelicula[10];
    private Scanner scanner = new Scanner(System.in);

    public void agregar() {
        int posicion = buscarPosicion();

        if (posicion != -1) {
            System.out.println("ingrese el nombre");
            String nombre = scanner.nextLine();
            Genero genero = elegirgenero();
            System.out.println("ingrese la descripción");
            String descripción = scanner.nextLine();
            System.out.println("ingrese la puntuación");
            double puntuación = scanner.nextDouble();
            scanner.nextLine();

            peliculas[posicion] = new Pelicula(nombre,genero,descripción,puntuación,posicion+1);
            System.out.println("La pelicula: " + nombre + " ha sido agregada correctamente en la posicion: " + (posicion+1));
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
        System.out.println("Ingrese la posicion de la pelicula que quiere modificar");
        int posicionModificar = scanner.nextInt();
        if (posicionModificar >= 1 && posicionModificar <= 10){
            if (peliculas[posicionModificar - 1] == null){
                System.out.println("La posicion " + posicionModificar + " está vacía");
            }else{

                    int opcion = 0;
                    do {
                        System.out.println("Elija una opción según la información que desea modificar: ");
                        System.out.println("1. cambiar nombre");
                        System.out.println("2. cambiar genero");
                        System.out.println("3. cambiar descripcion");
                        System.out.println("4. cambiar puntuacion");
                        System.out.println("5. Salir");
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcion){
                            case 1:
                                System.out.println("Escriba el nuevo nombre");
                                String nuevoNombre = scanner.nextLine();
                                peliculas[posicionModificar - 1].setNombre(nuevoNombre);
                                break;
                            case 2:
                                Genero genero = elegirgenero();
                                peliculas[posicionModificar - 1].setGénero(genero);
                                break;
                            case 3:
                                System.out.println("Ingrese la nueva descripcion");
                                String nuevaDescripcion = scanner.nextLine();
                                peliculas[posicionModificar - 1].setDescripción(nuevaDescripcion);
                                break;
                            case 4:
                                System.out.println("Ingrese la nueva puntuacion");
                                Double nuevaPuntuacion = scanner.nextDouble();
                                peliculas[posicionModificar - 1].setPuntuación(nuevaPuntuacion);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Esta opcion no es válida");
                        }

                    } while (opcion != 5);
                }
        }else{
            System.out.println("Esta posición no existe");
        }
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
    private Genero elegirgenero(){
        int opcion = 0;
        do {
            System.out.println("elija el genero");
            System.out.println("1. " + Genero.AVENTURA);
            System.out.println("2. " + Genero.COMEDIA);
            System.out.println("3. " + Genero.DRAMA);
            System.out.println("4. " + Genero.TERROR);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    return Genero.AVENTURA;
                case 2:
                    return Genero.COMEDIA;
                case 3:
                    return Genero.DRAMA;
                case 4:
                    return Genero.TERROR;
                default:
                    System.out.println("Esta opcion no es válida");
                    return null;
            }
        }while (true);
        }
    }
