package patterns.structural.facade;

class TrainBookingService implements BookingInterface{
    @Override
    public void book(BookingInfo info){
        System.out.println("Train booked");
    }
}
