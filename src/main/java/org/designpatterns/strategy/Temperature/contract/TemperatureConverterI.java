package org.designpatterns.strategy.Temperature.contract;

public interface TemperatureConverterI
{
    Float toFahrenheit(Float temp);
    Float toCelsius(Float temp);
    Float toKelvin(Float temp);
}
