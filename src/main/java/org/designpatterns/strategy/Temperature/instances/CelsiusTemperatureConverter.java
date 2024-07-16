package org.designpatterns.strategy.Temperature.instances;

import org.designpatterns.strategy.Temperature.contract.TemperatureConverterI;

public class CelsiusTemperatureConverter implements TemperatureConverterI
{
    @Override
    public Float toFahrenheit(Float temp) {
        return 1.8f * temp + 32f;
    }

    @Override
    public Float toCelsius(Float temp) {
        return temp;
    }

    @Override
    public Float toKelvin(Float temp) {
        return temp + 273.15f;
    }
}
