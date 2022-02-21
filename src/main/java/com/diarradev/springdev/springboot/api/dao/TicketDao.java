package com.diarradev.springdev.springboot.api.dao;

import com.diarradev.springdev.springboot.api.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket,Integer>{

}
