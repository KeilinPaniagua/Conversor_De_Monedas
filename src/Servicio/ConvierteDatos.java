package Servicio;

import Modelo.TasaDeConversion;
import Modelo.TasaDeConversionApi;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvierteDatos {
    private static final Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();

    public TasaDeConversionApi convierteDatos(String json) {
        // Convertir el JSON a objeto TasaDeConversionApi
        TasaDeConversionApi tasaDeConversionApi = gson.fromJson(json, TasaDeConversionApi.class);
        // Crear un objeto TasaDeConversion utilizando TasaDeConversionApi
        new TasaDeConversion(tasaDeConversionApi);
        // Retornar el objeto TasaDeConversionApi convertido
        return tasaDeConversionApi;
    }
}
