package org.designpatterns.strategy.Temperature.instances;

import org.designpatterns.strategy.Temperature.contract.TemperatureConverterI;

public class FahrenheitTemperatureConverter implements TemperatureConverterI
{
    @Override
    public Float toFahrenheit(Float temp) {
        return temp;
    }

    @Override
    public Float toCelsius(Float temp) {
        return (temp - 32) / 1.8f;
    }

    @Override
    public Float toKelvin(Float temp) {
        return (temp - 32) / 1.8f + 273.15f;
    }

}
