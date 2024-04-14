package com.example.trafficLightSimulation.service;

import com.example.trafficLightSimulation.model.lights;
import com.example.trafficLightSimulation.model.trafficSignal;
import org.springframework.stereotype.Service;

@Service
public class trafficSignalService {
    private trafficSignal signal = new trafficSignal(lights.GREEN, lights.RED);

    public synchronized void changeLights(){
        if(signal.getVehicleLight() == lights.GREEN){
            signal.setVehicleLight(lights.YELLOW);
        } else if (signal.getVehicleLight() == lights.YELLOW){
            signal.setVehicleLight(lights.RED);
            signal.setPedestrianLight(lights.GREEN);
        } else if (signal.getVehicleLight() == lights.RED) {
            signal.setPedestrianLight(lights.RED);
            signal.setVehicleLight(lights.GREEN);
        }
    }

    public trafficSignal getSignal(){
        return signal;
    }
}
