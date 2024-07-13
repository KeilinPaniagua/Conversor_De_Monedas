package Modelo;

public class TasaDeConversion {

    private final String timeLastUpdateUtc;
    private final String baseCode;
    private final String targetCode;
    private final Double conversionRate;
    private final Double conversionResult;

    public TasaDeConversion(TasaDeConversionApi tasaDeConversionApi) {
        this.timeLastUpdateUtc = tasaDeConversionApi.timeLastUpdateUtc();
        this.baseCode = tasaDeConversionApi.baseCode();
        this.targetCode = tasaDeConversionApi.targetCode();
        this.conversionRate = tasaDeConversionApi.conversionRate();
        this.conversionResult = tasaDeConversionApi.conversionResult();
    }

    @Override
    public String toString() {
        return "TasaDeConversion{" +
                " Fecha de la ultima actualizacion:'" + timeLastUpdateUtc + '\'' +
                ", Moneda base:'" + baseCode + '\'' +
                ", Moneda destino:'" + targetCode + '\'' +
                ", Tasa de conversion: " + conversionRate +
                ", Resultado de la conversion: $" + conversionResult +
                '}';
    }
}
