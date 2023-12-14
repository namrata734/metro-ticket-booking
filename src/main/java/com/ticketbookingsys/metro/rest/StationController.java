package com.ticketbookingsys.metro.rest;

import com.ticketbookingsys.metro.entity.Station;

import com.ticketbookingsys.metro.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StationController {

    private final StationService stationService;

    @PostMapping("/station")
    public void postStation(@RequestBody Station station){
        stationService.postStationIntoDB(station);
    }
}
