package ooad.logistics;

import java.util.Date;
import java.util.List;

public class Order {

    private String orderId;
    private Contact sender;
    private Contact recipient;
    private List<Package> packages;
    private Payment payment;
    private Date createdAt;
    private Consignment consignment;
    private TrackingStatus status;

}
