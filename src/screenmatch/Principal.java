package screenmatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Pelicula;
import modelo.Serie;

public class Principal {

    //private Pelicula peliculaUsuario = new Pelicula();
    //private Serie serieUsuario = new Serie();
    private List<Pelicula> peliculas = new ArrayList<>();
    private List<Serie> series = new ArrayList<>();

    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            String menu = """
                    Bienvenido(a) a Screenmatch
                    1) Registrar nueva pelicula
                    2) Registrar nueva serie
                    3) Calcular tiempo total de maratón
                          
                    9) Salir
                    """;
            System.out.println(menu);
            System.out.println("Ingresa una opcion:");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la película");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la película");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    /*peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();*/
                    System.out.print("\n");
                    Pelicula nuevaPelicula = new Pelicula();
                    nuevaPelicula.setNombre(nombre);
                    nuevaPelicula.setFechaDeLanzamiento(fechaDeLanzamiento);
                    nuevaPelicula.setTiempoDeDuracionEnMinutos(duracionEnMinutos);

                    peliculas.add(nuevaPelicula);
                    nuevaPelicula.muestraFichaTecnica();
                    System.out.print("\n");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa el numero de temporadas para esta serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la cantidad de episodios por cada temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la duración en minutos de cada episodio");
                    int minutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    /*
                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(minutosPorEpisodio);
                    serieUsuario.muestraFichaTecnica();
                     */
                    Serie nuevaSerie = new Serie();
                    nuevaSerie.setNombre(nombreSerie);
                    nuevaSerie.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    nuevaSerie.setTemporadas(temporadas);
                    nuevaSerie.setEpisodiosPorTemporada(episodiosPorTemporada);
                    nuevaSerie.setDuracionEnMinutosPorEpisodio(minutosPorEpisodio);

                    series.add(nuevaSerie);
                    nuevaSerie.muestraFichaTecnica();
                    System.out.print("\n");
                    break;
                case 3:
                    calculaTiempoTotal();
                    System.out.print("\n");
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public void calculaTiempoTotal() {
        int tiempoTotal = 0;

        // Suma los tiempos de todas las películas
        for (Pelicula pelicula : peliculas) {
            tiempoTotal += pelicula.getTiempoDeDuracionEnMinutos();
        }

        // Suma los tiempos de todas las series
        for (Serie serie : series) {
            tiempoTotal += serie.getTemporadas()
                    * serie.getEpisodiosPorTemporada()
                    * serie.getDuracionEnMinutosPorEpisodio();
        }

        System.out.println("El tiempo total necesario para la maratón es: " + tiempoTotal + " minutos.");
    }
}
