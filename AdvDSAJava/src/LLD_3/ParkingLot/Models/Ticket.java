package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter@Setter
public class Ticket extends BaseModel{
    private Date entryTime;
    private Gate entryGate;
    private Operator operator;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
}
