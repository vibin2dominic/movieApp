package com.vibin.movie.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Entity
@EqualsAndHashCode
@Data
public class Movie {

    private int id;

    private String title;

    private String duration;

    private String rating;

    private String timeSlot1;

    private String timeSlot2;

    private int numberOfTickets;

    private TicketPrice ticketPrice;


    public Movie(){

    }

    public Movie(String title, String duration, String rating, String timeSlot1, String timeSlot2, int numberOfTickets, TicketPrice ticketPrice) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.timeSlot1 = timeSlot1;
        this.timeSlot2 = timeSlot2;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
    }
}
