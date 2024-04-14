package com.example.trafficLightSimulation.scheduler;

import com.example.trafficLightSimulation.service.trafficSignalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class trafficSignalScheduler {

    @Autowired
    private trafficSignalService signalService;

    @Scheduled(fixedRate = 5000)
    public void automateSignalChange(){
        signalService.changeLights();
        System.out.println("Automated Signal Change Executed");
    }
}
