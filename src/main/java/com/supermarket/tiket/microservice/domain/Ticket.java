package com.supermarket.tiket.microservice.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Table(name = "TICKETS")
@Entity
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "TICKETID")
    Integer ticketId;

    @Column(name = "WINNINGNUMBER")
    Integer winningNumber;

    @Column(name = "STATUS")
    String status;

    @Column(name = "PRODUCTID")
    Integer productId;

    public Ticket() {
        super();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", winningNumber=" + winningNumber +
                ", status='" + status + '\'' +
                ", productId=" + productId +
                '}';
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public Ticket(Integer ticketId, Integer winningNumber, String status, Integer productId) {
        this.ticketId = ticketId;
        this.winningNumber = winningNumber;
        this.status = status;
        this.productId = productId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getWinningNumber() {
        return winningNumber;
    }

    public void setWinningNumber(Integer winningNumber) {
        this.winningNumber = winningNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
