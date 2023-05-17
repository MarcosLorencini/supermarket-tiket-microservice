package com.supermarket.tiket.microservice.repository;

import com.supermarket.tiket.microservice.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {

    Ticket findTicketByWinningNumber(Integer winningNumber);

    Ticket findAllByProductId(Integer productId);
}
