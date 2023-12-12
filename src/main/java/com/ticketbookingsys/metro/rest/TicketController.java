package com.ticketbookingsys.metro.rest;

import com.ticketbookingsys.metro.entity.TicketDetails;
import com.ticketbookingsys.metro.entity.TicketInfo;
import com.ticketbookingsys.metro.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TicketController {
    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/buyTicket")
    public TicketDetails buyTickets(@RequestBody TicketInfo ticketInfo){
        System.out.println(ticketInfo);
        return ticketService.generateTicket(ticketInfo);
    }
}
