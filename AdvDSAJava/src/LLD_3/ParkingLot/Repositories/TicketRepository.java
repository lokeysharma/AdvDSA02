package LLD_3.ParkingLot.Repositories;

import LLD_3.ParkingLot.Models.Ticket;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class TicketRepository {

    private Map<Long, Ticket> tickets = new TreeMap<>();
    private long previousId = 0L;
    public Ticket save(Ticket ticket) {
        ticket.setId(++previousId);
        tickets.put(ticket.getId(),ticket);
        return ticket;
    }

    public Optional<Ticket> findById(long id) {
        return Optional.ofNullable(tickets.get(id));
    }
}
