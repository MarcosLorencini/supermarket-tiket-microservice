package com.supermarket.tiket.microservice.controller;

import com.supermarket.tiket.microservice.domain.Ticket;
import com.supermarket.tiket.microservice.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    TicketRepository ticketRepository;

    @GetMapping(value = "/ticket")
    public List<Ticket> all () {
        return ticketRepository.findAll();
    }

    @RequestMapping(value = "/ticket/{ticketnumber}/", method = RequestMethod.GET)
    public Ticket findByTicketId(@PathVariable Integer ticketNumber) {
        return ticketRepository.findTicketByWinningNumber(ticketNumber);
    }

    @RequestMapping(value = "/ticket/product/{productId}/", method = RequestMethod.GET)
    public Ticket findByProductTicket(@PathVariable Integer productId) {
        return ticketRepository.findAllByProductId(productId);
    }
}
