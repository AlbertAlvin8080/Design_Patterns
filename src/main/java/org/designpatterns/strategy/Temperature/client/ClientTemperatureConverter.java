package org.designpatterns.strategy.Temperature.client;

import org.designpatterns.strategy.Temperature.contract.TemperatureConverterI;

public class ClientTemperatureConverter
{
    private TemperatureConverterI converter;

    public ClientTemperatureConverter(TemperatureConverterI converter) {
        this.converter = converter;
    }

    public void setConverter(TemperatureConverterI converter) {
        this.converter = converter;
    }

    public Float convert(Float temp, String output)
    {
        switch(output) 
        {
            case "F": case "f":
                return this.converter.toFahrenheit(temp);
            case "K": case "k":
                return this.converter.toKelvin(temp);
            case "C": case "c":
                return this.converter.toCelsius(temp);
            default:
                throw new IllegalArgumentException("The output type must be one of KELVIN, FAHRENHEIT OR CELSIUS.");
        }
    }

}
