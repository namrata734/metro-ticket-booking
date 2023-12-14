package com.ticketbookingsys.metro.service;

import com.ticketbookingsys.metro.entity.Station;
import com.ticketbookingsys.metro.repository.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StationService {

    private final StationRepository stationRepository;

    public void postStationIntoDB(Station station){
        stationRepository.save(station);
    }
}
