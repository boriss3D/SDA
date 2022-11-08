package patterns.structural.facade;

class HotelBookingService implements BookingInterface{
    @Override
    public void book(BookingInfo info){
        System.out.println("Hotel booked");
    }
}
