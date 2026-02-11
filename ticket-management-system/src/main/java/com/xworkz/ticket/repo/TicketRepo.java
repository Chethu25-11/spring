package com.xworkz.ticket.repo;

import com.xworkz.ticket.entity.TicketEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
public interface TicketRepo {
    TicketEntity saveTicketInfo(TicketEntity entity);
}
