package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Gate extends BaseModel{
    private String gateNumber;
    private GateType gateType;
    private Operator operator;
    private GateStatus gateStatus;
    private static long counter = 0;

    public Gate(String gateNumber, GateType gateType, Operator operator) {
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.operator = operator;
        this.gateStatus = GateStatus.OPEN;
        this.setId(++counter);
    }
}
