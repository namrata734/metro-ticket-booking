package com.ticketbookingsys.metro.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "ticketDetails")
@Data
@Builder
public class Ticket {

    @MongoId
    private String id;
    private  String source;
    private  String destination;
    private LocalDateTime time;
    private  int amount;
}
