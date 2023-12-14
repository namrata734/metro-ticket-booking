package com.ticketbookingsys.metro.request;

import lombok.Data;

@Data
public class CreateTicketReq {
    private String source;
    private String destination;

}
