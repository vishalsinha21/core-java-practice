package ooad.hotel;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Booking {

    private String bookingId;
    private Date startDate;
    private Date endDate;
    private PaymentStatus paymentStatus;
    private List<Room> roomsBooked;
    private BigDecimal amount;
    private Date bookingTime;

}
