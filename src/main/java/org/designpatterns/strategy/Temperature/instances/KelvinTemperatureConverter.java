package org.designpatterns.strategy.Temperature.instances;

import org.designpatterns.strategy.Temperature.contract.TemperatureConverterI;

public class KelvinTemperatureConverter implements TemperatureConverterI
{
    @Override
    public Float toFahrenheit(Float temp) {
        return 1.8f * (temp - 273.15f) + 32f;
    }

    @Override
    public Float toCelsius(Float temp) {
        return temp - 273.15f;
    }

    @Override
    public Float toKelvin(Float temp) {
        return temp;
    }
}
