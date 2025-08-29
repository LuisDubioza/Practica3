import java.util.Scanner;

public class Practica3Mal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBienvenido a Trash The Dragon \n");
        System.out.println("\nSeleccione una opción: \n");
        System.out.println("\n1.- Agregar pelicula teclee 1\n");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer
        
        

        switch (opcion) {
            case 1:

       System.out.println("\nIngrese el nombre de la pelicula \n");
       String nombrePelicula = scanner.nextLine();

       System.out.println("\nIngrese el año de estreno \n");
       int Estreno = scanner.nextInt();

       System.out.println("\nIngrese precio de renta \n");
       double precioRenta = scanner.nextDouble();

       System.out.println("\nIngrese la calificacion de 1 a 5 estrellas \n");
       int calificacion = scanner.nextInt();

       System.out.println("\nLa pelicula esta actualmente disponible (Si/No)?");
         String disponibilidad = scanner.next().toLowerCase();
         String disponibilidad2 = "";
         if (disponibilidad.equals("si")) {
            String disponibilidad2 = "La pelicula está disponible\n";
         } else if (disponibilidad.equals("no")) {
            String disponibilidad2 = "La pelicula no está disponible\n";
         } else {
             System.out.println("Opción no válida\n");
         }

        

        System.out.println("\nIngrese la clasificación de edad \n");
        char clasificacionEdad = scanner.next().charAt(0);

        System.out.println("\n");

        double iva = 1.16;
        double precioFinal = precioRenta * iva;
                
                break;
        
            default: System.out.println("Opción no válida\n");
                break;
        }
      
        
    }
    
    
}
