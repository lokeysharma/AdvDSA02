package LLD_3.ParkingLot.Repositories;

import LLD_3.ParkingLot.Models.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
@Getter@Setter
public class ParkingLotRepository {

    private Map<Long, ParkingLot> parkingLots = new TreeMap<>();

    public ParkingLotRepository() {

        ParkingLot parkingLot = new ParkingLot("DFL 01 DEV",ParkingLotStatus.Open);
        parkingLot.setId(1234L);
        parkingLots.put(parkingLot.getId(), parkingLot);
    }

    public ParkingLot findParkingLotByGate(Gate gate) {
        for (ParkingLot parkingLot : parkingLots.values()) {
            for(Gate gate1 : parkingLot.getEntryGates()){
                if(gate1.getId() == gate.getId()){
                    return parkingLot;
                }
            }
        }
        return null;
    }


   public Optional<ParkingLot> findParkingLotById(long id) {
        if(parkingLots.containsKey(id)){
            return Optional.of(parkingLots.get(id));
        }
        return Optional.empty();
        //return Optional.ofNullable(parkingLots.get(id));
    }

}
