package com.ticketbookingsys.metro.entity;

public class TicketInfo {
    private final int amt;

    public int getAmt() {
        return amt;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    private final String source;
    private final String destination;

    public TicketInfo(int amt, String source, String destination) {
        this.amt = amt;
        this.source = source;
        this.destination = destination;
    }

}
