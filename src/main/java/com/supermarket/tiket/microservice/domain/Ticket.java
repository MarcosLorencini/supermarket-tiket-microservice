package com.supermarket.tiket.microservice.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.Serializable;

@Table(name = "TICKETS")
@Entity
public class Ticket implements Serializable {

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
}
