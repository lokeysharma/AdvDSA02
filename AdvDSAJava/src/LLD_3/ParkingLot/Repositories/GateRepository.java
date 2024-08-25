package LLD_3.ParkingLot.Repositories;

import LLD_3.ParkingLot.Models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {

    private Map<Long, Gate> gates = new TreeMap<>();

    public GateRepository(ParkingLotRepository parkingLotRepository) {
        if(parkingLotRepository == null) {
            throw new IllegalArgumentException("ParkingLotRepository cannot be null");
        }
        for(Gate gate : parkingLotRepository.getParkingLots().get(1234L).getEntryGates()){
            gates.put(gate.getId(), gate);
        }
        for(Gate gate : parkingLotRepository.getParkingLots().get(1234L).getExitGates()){
            gates.put(gate.getId(), gate);
        }
    }

    public void saveGate(Gate gate) {
        gates.put(gate.getId(), gate);
    }

    public Optional<Gate> findGateByID(long id) {

        return Optional.ofNullable(gates.get(id));
    }
}


//ORM
// need to write query id no orm is there.

//1930 - for cybercrime
//1915 -  consumer helpline
//
//1064 NHAI