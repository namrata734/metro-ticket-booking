package com.ticketbookingsys.metro.utils;

import com.ticketbookingsys.metro.entity.Station;
import com.ticketbookingsys.metro.repository.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import java.nio.file.FileSystemNotFoundException;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class Utility {

    private final StationRepository stationRepository;

    public Station findStation(String name){
        Station station = Station.builder().name(name).build();
        Optional<Station> src =  stationRepository.findOne(Example.of(station));

        return src.orElseThrow(()-> new FileSystemNotFoundException());
    }
}
