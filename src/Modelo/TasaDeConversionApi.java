package Modelo;

public record TasaDeConversionApi(
        String timeLastUpdateUtc,
        String baseCode,
        String targetCode,
        Double conversionRate,
        Double conversionResult) {

}