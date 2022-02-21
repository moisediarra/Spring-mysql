package com.diarradev.springdev.springboot.api.controller;
import com.diarradev.springdev.springboot.api.dao.TicketDao;
import com.diarradev.springdev.springboot.api.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketDao dao;

    @PostMapping("/bookTickets")
    public String bookTicket(List<Ticket> tickets){
        dao.save(tickets);
        return "tickets booked : " + tickets.size();
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets(){
        return (List<Ticket>) dao.findAll();

    }

}
