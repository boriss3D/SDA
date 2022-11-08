package patterns.structural.facade;

public class BusBookingService implements BookingInterface{

    @Override
    public void book(BookingInfo bookingInfo) {
        System.out.println("booking bus");
    }
}
