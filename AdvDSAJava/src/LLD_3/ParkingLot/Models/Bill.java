package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter@Setter
public class Bill extends BaseModel{
    private Date exitTime;
    private Ticket ticket;
    private Gate exitGate;
    private Operator operator;
    private int amount;
    private List<Payment> payments; // for partial payments need to have list of payments


}
