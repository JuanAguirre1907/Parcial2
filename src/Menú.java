import java.util.Scanner;

public class Menú {
    private Scanner scanner = new Scanner(System.in);
    private  AdministrarPeliculas administrarPeliculas = new AdministrarPeliculas();

    public void abrirMenu(){
        int opcion = 0;
        do {
            System.out.println("Seleccione la accion que desea realizar:");
            System.out.println("1. Agregar pelicula");
            System.out.println("2. Eliminar pelicula");
            System.out.println("3. Modificar la informacion de una pelicula");
            System.out.println("4. Imprimir la lista de peliculas");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    administrarPeliculas.agregar();
                    break;
                case 2:
                    administrarPeliculas.eliminar();
                    break;
                case 3:
                    administrarPeliculas.modificar();
                    break;
                case 4:
                    administrarPeliculas.mostrar();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Esta opcion no es valida");
            }
        }while (opcion != 5);
    }
}
