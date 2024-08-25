package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter@Setter
public class ParkingLot extends BaseModel{

    private String name;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    //capacity
    //private Map<VehicleType, Integer> vehicleCapacities; // was not a good idea because of long and extensable no of data
    private List<VehicleTypeCapacity> vehicleTypeCapacities;
    private ParkingLotStatus parkingLotStatus;
    private SlotAssignmentStrategyType slotAssignmentStrategyType; // can be changed by admin.

    public ParkingLot(String name, ParkingLotStatus parkingLotStatus) {
        this.name = name;
        this.parkingLotStatus = parkingLotStatus;
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        parkingFloors.add(new ParkingFloor("First Floor", 10));
        parkingFloors.add(new ParkingFloor("Second Floor", 5));
        parkingFloors.add(new ParkingFloor("Third Floor", 3));

        this.parkingFloors = parkingFloors;
        List<Gate> entryGates = new ArrayList<>();
        entryGates.add(new Gate("one",GateType.Entry,null));
        List<Gate> exitGates = new ArrayList<>();
        exitGates.add(new Gate("two",GateType.Exit,null));

        this.entryGates = entryGates;
        this.exitGates = exitGates;
    }
}


// all of those have same attributes
//base model for all the common components