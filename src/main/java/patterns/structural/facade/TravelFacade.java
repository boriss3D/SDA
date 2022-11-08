package patterns.structural.facade;

public class TravelFacade{

    private BookingInterface flightBooking;
    private BookingInterface trainBooking;
    private BookingInterface hotelBooking;
    private BookingInterface busBooking;

    public TravelFacade(){
        flightBooking = new FlightBookingService();
        trainBooking = new TrainBookingService();
        hotelBooking = new HotelBookingService();
        busBooking =  new BusBookingService();
    }

    public void book(BookingType type, BookingInfo info){
        switch(type){
            case Flight:
                // book flight;
                flightBooking.book(info);
                break;
            case Hotel:
                // book hotel;
                hotelBooking.book(info);
                break;
            case Train:
                // book Train;
                trainBooking.book(info);
                break;
            case Flight_And_Hotel:
                // book Flight and Hotel
                flightBooking.book(info);
                hotelBooking.book(info);
                break;
             case Train_And_Hotel:
                // book Train and Hotel
                trainBooking.book(info);
                hotelBooking.book(info);
                 break;
            case BUS:
                busBooking.book(info);
                break;
        }
    }
}
