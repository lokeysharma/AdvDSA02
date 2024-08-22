package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter@Setter
public class Payment extends BaseModel{
    private int amount;
    private PaymentMode paymentMode;
    private String refNumber;
    private Date paymentDate;
    private PaymentStatus paymentStatus;

}
