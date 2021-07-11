package com.kodilla.testing.weather.stub;
//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateMedianTemperature() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        double median = 0.0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            temperaturesMap.put(temperature.getKey(), temperature.getValue());
        }

        ArrayList<Double> temperatureList = new ArrayList<Double>(temperaturesMap.values());
        Collections.sort(temperatureList);

        int temperatureReading = temperatureList.size();

        if (temperatureReading % 2 != 0) {
            median = (double) (temperatureList.get((temperatureReading - 1) / 2));
        } else {
            median = (double) (((temperatureList.get((temperatureReading - 1) / 2)) + (temperatureList.get((temperatureReading / 2)))) / 2);
        }
        median = Math.round(median * 100.0) / 100.0;
        return median;
    }


    public double calculateAverageTemperature() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        double sumOfTemperatures = 0.0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            temperaturesMap.put(temperature.getKey(), temperature.getValue());
        }

        Set<Map.Entry<String, Double>> temperaturesSet = temperaturesMap.entrySet();
        for (Map.Entry<String, Double> temp : temperaturesSet) {
            sumOfTemperatures += temp.getValue();
        }
        double averageTemperature = Math.round((sumOfTemperatures / (temperaturesMap.size())) * 100.0) / 100.0;
        return averageTemperature;
    }
}
