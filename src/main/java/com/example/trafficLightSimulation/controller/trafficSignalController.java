package com.example.trafficLightSimulation.controller;

import com.example.trafficLightSimulation.model.trafficSignal;
import com.example.trafficLightSimulation.service.trafficSignalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class trafficSignalController {

    @Autowired
    private trafficSignalService signalService;

    @GetMapping("/signal")
    public trafficSignal getSignal(){
        return signalService.getSignal();
    }
}
