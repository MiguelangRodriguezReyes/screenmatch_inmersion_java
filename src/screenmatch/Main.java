
package screenmatch;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        //System.out.println("Bienvenidos a la inmersión en Java");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 8.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Los piratas de Silicon Valley";
        String sinopsis = """
                La mejor pelicula del fin del milenio sobre como Steve Jobs y Bill Gates
                cambiaron la historia del mundo de la informatica
                """;
        
        System.out.println("Pelicula: " + nombre);
            System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Rating: " + evaluacion);
        System.out.println("Incluido en el plan basico?: " + incluidoEnElPlanBasico);
        /*
        double mediaEvaluacion = (6.5 + 6.8 + 3) / 3;
        System.out.println("Media de la evaluación de " + nombre + ": " + mediaEvaluacion);
        */
        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula Popular en el momento");
            System.out.print("\n");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
            System.out.print("\n");
        }

        // Evaluaciones usando while
        Scanner teclado = new Scanner(System.in);
        double mediaEvaluacionUsuario = 0;
        int contador = 0;
        int totalEvaluaciones = 5; // Número de evaluaciones a ingresar

        while (contador < totalEvaluaciones) {
            System.out.println("Ingresa la nota que le darias a " + nombre + ":");
            double notaLPSV = teclado.nextDouble();
            mediaEvaluacionUsuario += notaLPSV;
            contador++;
        }

        System.out.println("La media de la pelicula " +
                nombre + " calculada por el usuario es: " + mediaEvaluacionUsuario / totalEvaluaciones);
    }
}
