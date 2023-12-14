package com.ticketbookingsys.metro.rest;

import com.ticketbookingsys.metro.entity.Ticket;
import com.ticketbookingsys.metro.request.CreateTicketReq;
import com.ticketbookingsys.metro.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;

    @PostMapping("/buyTicket")
    public ResponseEntity<Ticket> buyTickets(@RequestBody CreateTicketReq createTicketReq){
        return ResponseEntity.ok(ticketService.generateTicket(createTicketReq));
    }
}
