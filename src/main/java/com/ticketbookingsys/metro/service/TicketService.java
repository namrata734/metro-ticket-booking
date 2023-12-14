package com.ticketbookingsys.metro.service;


import com.ticketbookingsys.metro.entity.Station;
import com.ticketbookingsys.metro.entity.Ticket;
import com.ticketbookingsys.metro.repository.StationRepository;
import com.ticketbookingsys.metro.repository.TicketRepository;
import com.ticketbookingsys.metro.request.CreateTicketReq;
import com.ticketbookingsys.metro.utils.Utility;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.nio.file.FileSystemNotFoundException;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;
    private final StationRepository stationRepository;
    private final Utility utility;

    public Ticket generateTicket(CreateTicketReq createTicketReq){

        Station des = utility.findStation(createTicketReq.getDestination());
        Station src = utility.findStation(createTicketReq.getSource());

        Ticket ticket = Ticket.builder()
                .source(createTicketReq.getSource())
                .destination(createTicketReq.getDestination())
                .time(LocalDateTime.now())
                .amount(Math.abs(src.getPrice()-des.getPrice()))
                .build();
        ticketRepository.save(ticket);
        return ticket;
    }
}
