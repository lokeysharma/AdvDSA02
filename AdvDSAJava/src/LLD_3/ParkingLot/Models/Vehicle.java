package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Vehicle extends BaseModel{
    private String licencePlate;
    private String OwnerName;
    private VehicleType vehicleType;

}
