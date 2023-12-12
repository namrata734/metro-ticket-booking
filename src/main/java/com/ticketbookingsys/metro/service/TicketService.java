package com.ticketbookingsys.metro.service;


import com.ticketbookingsys.metro.UserRepository;
import com.ticketbookingsys.metro.entity.TicketDetails;
import com.ticketbookingsys.metro.entity.TicketInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TicketService {
    @Autowired
    private UserRepository repo;

    public TicketDetails generateTicket(TicketInfo ticketInfo){
        TicketDetails ticketDetails = new TicketDetails(ticketInfo.getSource(), ticketInfo.getDestination(), new Date(), ticketInfo.getAmt());
        repo.save(ticketDetails);
        return ticketDetails;
    }
}
