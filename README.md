# Poryecto Conversor de Monedas

Este sistema ofrece una manera sencilla de convertir entre dólares estadounidenses y diferentes monedas extranjeras.
Funciona mediante el uso de una API de tipo de cambio llamada [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de conversión más recientes.

## Funcionamiento

El sistema permite al usuario seleccionar entre 4 monedas que son Peso argentino, Real brasileño, Peso colombiano y Colón costarricense y las convierte según la cantidad ingresada en dólares estadounidenses.
Las opciones de conversion que tiene el programa son:

![Menu](https://github.com/KeilinPaniagua/Conversor_De_Monedas/blob/main/Men%C3%BA.png)

## Requisitos

Contar con Java apartir de la versión 21 y Gson 2.10.1
Se requiere una clave de API válida para la API de tipo de cambio. Reemplaza la variable `apiKey` en el código con tu clave.

## Configuración

Reemplaza `apiKey` en el código por tu clave de API válida para la API de tipo de cambio.

## Limitaciones y Consideraciones

1) El programa puede mostrar errores si la clave de API no es válida o si la API restringe el acceso.
2) Las tasas de cambio obtenidas de la API pueden no estar actualizadas en tiempo real.

## Video del funcionamiento de la aplicación
[![Video del funcionamiento de la aplicación](https://github.com/KeilinPaniagua/Conversor_De_Monedas/blob/main/Conversor_De_Monedas.mp4)