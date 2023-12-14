package com.ticketbookingsys.metro.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Builder
@Document(collection = "stations")
public class Station {

    @MongoId
    private String id;
    private String name;
    private Integer price;
}
