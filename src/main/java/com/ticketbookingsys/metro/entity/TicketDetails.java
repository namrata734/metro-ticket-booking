package com.ticketbookingsys.metro.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "ticketDetails")
public class TicketDetails {

    private  String source;
    private  String destination;
    private  Date dateWithTimeZone;
    private  int amount;


    public TicketDetails(String source, String destination, Date dateWithTimeZone, int amount) {
        this.source = source;
        this.destination = destination;
        this.dateWithTimeZone = dateWithTimeZone;
        this.amount = amount;
    }


}
