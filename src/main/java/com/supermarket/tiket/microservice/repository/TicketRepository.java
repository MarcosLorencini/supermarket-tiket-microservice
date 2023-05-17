package com.supermarket.tiket.microservice.repository;

import com.supermarket.tiket.microservice.domain.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket,Integer> {

    Ticket findTicketByWinningNumber(Integer winningNumber);

    Ticket findAllByProductId(Integer productId);
}
