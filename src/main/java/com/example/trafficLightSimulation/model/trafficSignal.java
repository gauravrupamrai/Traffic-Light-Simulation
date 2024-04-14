package com.example.trafficLightSimulation.model;

public class trafficSignal {
    private lights vehicleLight;
    private lights pedestrianLight;

    public trafficSignal(lights vehicleLight, lights pedestrianLight) {
        this.vehicleLight = vehicleLight;
        this.pedestrianLight = pedestrianLight;
    }

    public lights getVehicleLight() {
        return vehicleLight;
    }

    public void setVehicleLight(lights vehicleLight) {
        this.vehicleLight = vehicleLight;
    }

    public lights getPedestrianLight() {
        return pedestrianLight;
    }

    public void setPedestrianLight(lights pedestrianLight) {
        this.pedestrianLight = pedestrianLight;
    }

    @Override
    public String toString() {
        return "TrafficSignal{" +
                "vehicleLight=" + vehicleLight +
                ", pedestrianLight=" + pedestrianLight +
                '}';
    }
}
