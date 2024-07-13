package Menu;

public class MenuDeAplicacion {
    public static String obtenerMenu() {
        return """
               \n******************************************************
               *    Sea bienvenido/a al Conversor de Monedas =]     *
               ******************************************************
               *    1) Dólar =>> Peso argentino                     *
               *    2) Peso argentino =>> Dólar                     *
               *    3) Dólar =>> Real brasileño                     *
               *    4) Real brasileño =>> Dólar                     *
               *    5) Dólar =>> Peso colombiano                    *
               *    6) Peso colombiano =>> Dólar                    *
               *    7) Dólar =>> Colón costarricense                *
               *    8) Colón costarricense =>> Dólar                *
               *    9) Salir                                        *
               ******************************************************
               *    Elija una opción válida                         *
               ******************************************************""";
    }
}