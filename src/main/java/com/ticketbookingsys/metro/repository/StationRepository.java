package com.ticketbookingsys.metro.repository;

import com.ticketbookingsys.metro.entity.Station;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StationRepository extends MongoRepository<Station, String> {
}
