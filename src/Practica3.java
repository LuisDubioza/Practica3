import java.util.Scanner;

public class Practica3 {

         // Aquí definimos los códigos de color ANSI :)
         public static final String Reset = "\u001B[0m";
        public static final String ROJ = "\u001B[31m";
        public static final String VER = "\u001B[32m";
        public static final String AMA = "\u001B[33m";
        public static final String AZ = "\u001B[34m";
        public static final String CYA = "\u001B[36m";
        public static final String BLA = "\u001B[37m";
        public static final String MAG = "\u001B[35m";
        public static final String NAR = "\u001B[93m";
        


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);     // hago mi Scanner llamado scanner

            System.out.println(ROJ + "\nBienvenido a Trash The Dragon \n" + Reset); //* Bienvenida en rojo para mas placer
            System.out.println("¿Cual es su nombre?\n");       // Pregunto el nombre
            String nombreUsuario = scanner.nextLine();
            System.out.println("\n¿Cual es su edad?\n");       // La edad
            Integer edadUsuario = scanner.nextInt();
            scanner.nextLine(); // limpio el buffer del ultimo enter por que si no me da error
            System.out.println("\nHola " + nombreUsuario + ", seleccione una opción: \n");
            System.out.println("1 La garra de hierro");
            System.out.println("2 Superman");
            System.out.println("3 Sherk\n");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpio el buffer del ultimo enter por que si no me da error
            System.out.println("\nMetodo de pago\n");
            System.out.println("Teclee 1 para efectivo\n");  // Pregunto el metodo de pago
            System.out.println("Teclee 2 para tarjeta\n");
            double IVA = 1.16;  // Defino el IVA como una constante
            int metodopago = scanner.nextInt();  // Leo el metodo de pago
            double pago = 0.0;
            if (metodopago == 1) {  //Si es efectivo tiene que poner 1, si no 2
                pago = 1.0;  //
            } else if (metodopago == 2) {
                pago = 1.05;     // Sentencia, si es tarjeta se suma .05% del valor total, por eso 1.05
            } else {     
                System.out.println("Opción no válida :( \n");  // Si no es ninguna de las dos opciones, no es valido
                return; // Salir del programa si el método de pago no es válido

            }

            switch (opcion) {
                case 1:
                    String pelicula1 = "La garra de hierro";   // Datos de la pelicula 1
                    int estreno1 = 2024;
                    int duracion1 = 120;
                    double precioRenta1 = 250.0;
                    int calificacion1 = 5;
                    String disponibilidad = "La pelicula está disponible";
                    String clasificacion1 = "C";
                    System.out.println(ROJ + "\nTítulo: " + pelicula1 + "\n" + Reset); //Usamos los colores para cada dato
                    System.out.println(NAR + "Año de estreno: " + estreno1 + "\n" + Reset); // Color + tecto + Stryng + Reset
                    System.out.println(BLA + "Precio sin descuento ni IVA: $" + precioRenta1 + "\n" + Reset);
                    System.out.println(AZ + "Duración: " + duracion1 + " minutos \n" + Reset);
                    System.out.println(AMA + "Calificación: " + calificacion1 + " estrella\n" + Reset);
                    System.out.println(VER + "Clasificación: " + clasificacion1 + "\n" + Reset);
                    System.out.println(MAG + disponibilidad + "\n" + Reset);
                    int descuento = 2025 - estreno1;
                    double precioFinal = 0.0;
                    if (descuento >= 10) {
                        precioFinal = precioRenta1 * 0.9 * pago * IVA;    // Si tiene mas de 10 años se le hace un 10% de descuento
                        System.out.println(CYA + "Precio de renta con descuento: $" + precioFinal + "\n" + Reset);
                    } else {
                        precioFinal = precioRenta1 * pago * IVA;   // Si no tiene descuento se le cobra el precio normal + 
                        System.out.println(CYA + "Precio de renta: $" + precioFinal + "\n" + Reset);
                    }
                    if (edadUsuario >= 18) {
                        System.out.println("Disfruta la película\n");
                    } else {
                        System.out.println("No tienes la edad suficiente para ver esta película"); // Si no tiene la edad suficiente
                        int a = 18 - edadUsuario;               // Le digo cuantos años le faltan 
                        System.out.println("Podras rentarla en " + a + " años\n");
                    }

                    break;

                case 2:
                    String pelicula2 = "Superman"; // Datos de la pelicula 2
                    int estreno2 = 2025;
                    int duracion2 = 130;
                    double precioRenta2 = 300.0;
                    int calificacion2 = 4;
                    String disponibilidad2 = "La pelicula no está disponible";
                    String clasificacion2 = "B";
                    System.out.println(ROJ + "Título: " + pelicula2 + "\n" + Reset);
                    System.out.println(NAR + "Año de estreno: " + estreno2 + "\n" + Reset);
                    System.out.println(BLA + "Precio sin descuento ni  IVA: $" + precioRenta2 + "\n" + Reset);
                    System.out.println(AZ + "Duración: " + duracion2 + " minutos \n" + Reset);
                    System.out.println(AMA + "Calificación: " + calificacion2 + " estrellas\n" + Reset);
                    System.out.println(MAG + disponibilidad2 + "\n" + Reset);
                    System.out.println(VER + "Clasificación: " + clasificacion2 + "\n" + Reset);
                    int descuento2 = 2025 - estreno2;
                    double precioFinal2 = 0.0;
                    if (descuento2 >= 10) {
                        precioFinal2 = precioRenta2 * 0.9 * pago * IVA;        
                        System.out.println(CYA + "Precio de renta con descuento: $" + precioFinal2 + "\n" + Reset);
                    } else {
                        precioFinal2 = precioRenta2 * pago * IVA;
                        System.out.println(CYA + "Precio de renta: $" + precioFinal2 + "\n" + Reset);
                    }
                    if (edadUsuario >= 12) {
                        System.out.println("Disfruta la película\n");
                    } else {
                        System.out.println("No tienes la edad suficiente para ver esta película");
                        int b = 12 - edadUsuario;
                        System.out.println("Podras rentarla en " + b + " años\n");
                    }

                    break;
                case 3:
                    String pelicula3 = "Shrek";  // Datos de la pelicula 3
                    int estreno3 = 2005;
                    int duracion3 = 110;
                    double precioRenta3 = 200.0;
                    int calificacion3 = 3;
                    String disponibilidad3 = "La pelicula está disponible";
                    String clasificacion3 = "A";

                    System.out.println(ROJ + "Título: " + pelicula3 + "\n" + Reset);
                    System.out.println(NAR + "Año de estreno: " + estreno3 + "\n" + Reset);
                    System.out.println(BLA + "Precio sin descuento ni  IVA: $" + precioRenta3 + "\n" + Reset);
                    System.out.println(AZ + "Duración: " + duracion3 + " minutos \n" + Reset);
                    System.out.println(AMA + "Calificación: " + calificacion3 + " estrellas\n" + Reset);
                    System.out.println(MAG + disponibilidad3 + "\n" + Reset);
                    System.out.println(VER + "Clasificación: " + clasificacion3 + "\n" + Reset);
                    int descuento3 = 2025 - estreno3;
                    double precioFinal3 = 0.0;
                    if (descuento3 >= 10) {
                        precioFinal3 = precioRenta3 * 0.9 * pago * IVA;        
                        System.out.println(CYA + "Precio de renta con descuento: $" + precioFinal3 + "\n" + Reset);
                    } else {
                        precioFinal3 = precioRenta3 * pago * IVA;
                        System.out.println(CYA + "Precio de renta: $" + precioFinal3 + "\n" + Reset);
                    }
                    System.out.println("Disfruta la película\n");
                
                    break;

            
                default: System.out.println("Opción no válida\n");
                    break;
            }
        scanner.close();
        }
      
    }

