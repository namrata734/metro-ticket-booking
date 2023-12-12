package com.ticketbookingsys.metro;

import com.ticketbookingsys.metro.entity.TicketDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<TicketDetails, String> {
}
