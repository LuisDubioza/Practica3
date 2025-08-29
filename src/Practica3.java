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
                String disponibilidad = "\nLa pelicula está disponible\n";
                String clasificacion1 = "C";
                System.out.println("\nTítulo: " + pelicula1 + "\n");
                System.out.println("\nAño de estreno: " + estreno1 + "\n");
                System.out.println("\nDuración: " + duracion1 + " minutos \n");
                System.out.println("\nCalificación: " + calificacion1 + "estrella\n");
                System.out.println("\nClasificaicón: " + clasificacion1 + "\n");
                System.out.println("\n" + disponibilidad + "\n");
                int descuento = 2025 - estreno1;
                double precioFinal = 0.0;
                if (descuento >= 10) {
                    precioFinal = precioRenta1 * 0.9 * pago;        
                    System.out.println("\nPrecio de renta con descuento: $" + precioFinal + "\n");
                } else {
                    precioFinal = precioRenta1 * pago;
                    System.out.println("\nPrecio de renta: $" + precioFinal + "\n");
                if (edadUsuario >= 18) {
                    System.out.println("Disfruta la película\n");
                } else {
                    System.out.println("\nNo tienes la edad suficiente para ver esta película");
                    int a = 18 - edadUsuario;
                    System.out.println("Podras rentarla en " + a + " años\n");
                }

                break;

            case 2:
                String pelicula2 = "Superman";
                int estreno2 = 2025;
                int duracion2 = 130;
                double precioRenta2 = 300.0;
                int calificacion2 = 4;
                String disponibilidad2 = "La pelicula no está disponible\n";
                String clasificacion2 = "B";
                System.out.println("\nTítulo: " + pelicula2 + "\n");
                System.out.println("\nAño de estreno: " + estreno2 + "\n");
                System.out.println("\nDuración: " + duracion2 + " minutos \n");
                System.out.println("\nCalificación: " + calificacion2 + "estrella\n");
                System.out.println("\n" + disponibilidad2 + "\n");
                System.out.println("\nClasificaicón: " + clasificacion2 + "\n");
                int descuento2 = 2025 - estreno2;
                double precioFinal2 = 0.0;
                if (descuento2 >= 10) {
                    precioFinal2 = precioRenta2 * 0.9 * pago;        
                    System.out.println("\nPrecio de renta con descuento: $" + precioFinal2 + "\n");
                } else {
                    precioFinal2 = precioRenta2 * pago;
                    System.out.println("\nPrecio de renta: $" + precioFinal2 + "\n");
                System.out.println("\nCalificación: " + calificacion2 + " estrellas\n");
                if (edadUsuario >= 13) {
                    System.out.println("Disfruta la película\n");
                } else {
                    System.out.println("\nNo tienes la edad suficiente para ver esta película");
                    int b = 13 - edadUsuario;
                    System.out.println("Podras rentarla en " + b + " años\n");
                }

                break;
            case 3:
                String pelicula3 = "Sherk";
                int estreno3 = 2005;
                int duracion3 = 110;
                double precioRenta3 = 200.0;
                int calificacion3 = 3;
                String disponibilidad3 = "La pelicula está disponible\n";
                String clasificacion3 = "A";

                System.out.println("\nTítulo: " + pelicula3 + "\n");
                System.out.println("\nAño de estreno: " + estreno3 + "\n");
                System.out.println("\nDuración: " + duracion3 + " minutos \n");
                System.out.println("\nCalificación: " + calificacion3 + "estrella\n");
                System.out.println("\n" + disponibilidad3 + "\n");
                System.out.println("\nClasificaicón: " + clasificacion3 + "\n");
                int descuento3 = 2025 - estreno3;
                double precioFinal3 = 0.0;
                if (descuento3 >= 10) {
                    precioFinal3 = precioRenta3 * 0.9 * pago;        
                    System.out.println("\nPrecio de renta con descuento: $" + precioFinal3 + "\n");
                } else {
                    precioFinal3 = precioRenta3 * pago;
                    System.out.println("\nPrecio de renta: $" + precioFinal3 + "\n");
                if (edadUsuario >= 0) {
                    System.out.println("Disfruta la película\n");
                } else {
                    System.out.println("\nNo tienes la edad suficiente para ver esta película");
                    int c = 0 - edadUsuario;
                    System.out.println("Podras rentarla en " + c + " años\n");
                }
                break;

        
            default: System.out.println("Opción no válida\n");
                break;
        }
    }
}
