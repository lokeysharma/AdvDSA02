package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

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
}


// all of those have same attributes
//base model for all the common components