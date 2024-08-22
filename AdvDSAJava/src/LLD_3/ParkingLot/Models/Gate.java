package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Gate extends BaseModel{
    private String gateNumber;
    private GateType gateType;
    private Operator operator;
    private GateStatus gateStatus;
}
