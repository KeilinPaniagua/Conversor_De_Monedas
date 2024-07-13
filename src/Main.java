import Menu.MenuDeAplicacion;
import Modelo.TasaDeConversionApi;
import Servicio.ConsumoApi;
import Servicio.ConvierteDatos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsumoApi consumoApi = new ConsumoApi();
        ConvierteDatos conversor = new ConvierteDatos();
        Scanner teclado = new Scanner(System.in);

        String menu = MenuDeAplicacion.obtenerMenu();
        String solicitudAConvertir = "\nIngresa el valor que deseas convertir:";

        while (true) {
            try {
                System.out.println(menu);
                int solicitudUsuario = teclado.nextInt();

                if (solicitudUsuario == 9) {
                    System.out.println("\n¡Gracias por utilizar nuestro conversor de monedas, nos vemos pronto!");
                    break;
                } else if (solicitudUsuario <= 0 || solicitudUsuario >= 10) {
                    System.out.println("\nOpción inválida, ejecute nuevamente por favor.");
                    continue;
                }

                System.out.println(solicitudAConvertir);
                double montoUsuario = teclado.nextDouble();

                String urlBase = "https://v6.exchangerate-api.com/v6/";
                String apiKey = "ffb3a216689ffa738715fe2a";
                String urlRespuesta = "/pair/";
                String monedaBase = "";
                String monedaDestino = "";

                switch (solicitudUsuario) {
                    case 1 -> {
                        monedaBase = "USD";
                        monedaDestino = "ARS";
                    }
                    case 2 -> {
                        monedaBase = "ARS";
                        monedaDestino = "USD";
                    }
                    case 3 -> {
                        monedaBase = "USD";
                        monedaDestino = "BRL";
                    }
                    case 4 -> {
                        monedaBase = "BRL";
                        monedaDestino = "USD";
                    }
                    case 5 -> {
                        monedaBase = "USD";
                        monedaDestino = "COP";
                    }
                    case 6 -> {
                        monedaBase = "COP";
                        monedaDestino = "USD";
                    }
                    case 7 -> {
                        monedaBase = "USD";
                        monedaDestino = "CRC";
                    }
                    case 8 -> {
                        monedaBase = "CRC";
                        monedaDestino = "USD";
                    }
                }

                URI direccion = URI.create(urlBase + apiKey + urlRespuesta + monedaBase + "/" + monedaDestino + "/" + montoUsuario);

                String json = consumoApi.obtenerDatosApi(direccion);
                TasaDeConversionApi conversion = conversor.convierteDatos(json);

                BigDecimal resultado = BigDecimal.valueOf(montoUsuario * conversion.conversionRate());
                System.out.println("\nEl valor de: $" + montoUsuario + " [" + monedaBase + "] corresponde al valor final de =>>> $"
                        + resultado.setScale(2, RoundingMode.HALF_UP) + " [" + monedaDestino + "].");

            } catch (InputMismatchException e) {
                System.out.println("Ingrese solo valores numéricos, por favor intente de nuevo.");
                teclado.next(); // Limpiar el buffer del scanner después de un error de entrada
            } catch (RuntimeException e) {
                System.out.println("Error al obtener datos de la API: " + e.getMessage());
            }
        }
        teclado.close(); // Cerrar el scanner al finalizar el programa
    }
}