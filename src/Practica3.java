import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBienvenido a Trash The Dragon \n");
        System.out.println("\n¿Cual es su nombre?\n");
        String nombreUsuario = scanner.nextLine();
        System.out.println("\n¿Cual es su edad?\n");
        Integer edadUsuario = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer
        System.out.println("\nHola " + nombreUsuario + ", seleccione una opción: \n");
        System.out.println("1 La garra");
        System.out.println("2 Superman");
        System.out.println("3 Sherk");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer
        System.out.println("\nMetodo de pago\n");
        System.out.println("Teclee 1 para efectivo\n");
        System.out.println("Teclee 2 para tarjeta\n");
        int metodopago = scanner.nextInt();
        double pago = 0.0;
        if (metodopago == 1) {
            pago = 1.0;
        } else if (opcion == 2) {
            pago = 1.05;
        } else {
            System.out.println("Opción no válida\n");
        }

        switch (opcion) {
            case 1:
                String pelicula1 = "La garra";
                int estreno1 = 2024;
                int duracion1 = 120;
                double precioRenta1 = 250.0;
                int calificacion1 = 5;
                String disponibilidad = "La pelicula está disponible\n";
                String clasificacion1 = "C";
                break;
            case 2:
                String pelicula2 = "Superman";
                int estreno2 = 2025;
                int duracion2 = 130;
                double precioRenta2 = 300.0;
                int calificacion2 = 4;
                String disponibilidad2 = "La pelicula no está disponible\n";
                String clasificacion2 = "B";
                break;
            case 3:
                String pelicula3 = "Sherk";
                int estreno3 = 2005;
                int duracion3 = 110;
                double precioRenta3 = 200.0;
                int calificacion3 = 3;
                String disponibilidad3 = "La pelicula está disponible\n";
                String clasificacion3 = "A";
                break;

        
            default:
                break;
        }
    }
}
