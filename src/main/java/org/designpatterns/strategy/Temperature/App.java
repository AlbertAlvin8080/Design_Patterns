package org.designpatterns.strategy.Temperature;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Supplier;

import org.designpatterns.strategy.Temperature.client.ClientTemperatureConverter;
import org.designpatterns.strategy.Temperature.contract.TemperatureConverterI;
import org.designpatterns.strategy.Temperature.instances.CelsiusTemperatureConverter;
import org.designpatterns.strategy.Temperature.instances.FahrenheitTemperatureConverter;
import org.designpatterns.strategy.Temperature.instances.KelvinTemperatureConverter;

public class App 
{
    public static void main( String[] args )
    {
        HashMap<String, Supplier<TemperatureConverterI>> map = new HashMap<>();
        map.put("F", () -> new FahrenheitTemperatureConverter());
        map.put("C", () -> new CelsiusTemperatureConverter());
        map.put("K", () -> new KelvinTemperatureConverter());

        // map.put("FC", ...);
        // map.put("FK", ...);
        // map.put("CK", ...);
        // map.put("CF", ...);
        // map.put("KF", ...);
        // map.put("KC", ...);

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Using comma for reading numbers.

        System.out.println("Insert the input type:");
        String input = sc.next().toUpperCase();
        sc.nextLine(); // Cleaning Buffer

        System.out.println("Insert the output type:");
        String output = sc.next().toUpperCase();
        sc.nextLine();

        System.out.println("Insert the temperature:");
        Float temp = sc.nextFloat();
        sc.nextLine();

        ClientTemperatureConverter converter = new ClientTemperatureConverter(
                map.get(input).get()
        );

        Float result = converter.convert(temp, output);
        System.out.println("Result: " + result);

        sc.close();
    }
}
