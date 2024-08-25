package LLD_3.ParkingLot.Repositories;

import LLD_3.ParkingLot.Models.Bill;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class BillRepository {
    private Map<Long, Bill> bills = new TreeMap<>();
    private long previousId = 0L;
    public Bill save(Bill bill) {
        bill.setId(++previousId);
        bills.put(bill.getId(),bill);
        return bill;
    }

    public Optional<Bill> findById(long id) {
        return Optional.ofNullable(bills.get(id));
    }
}
