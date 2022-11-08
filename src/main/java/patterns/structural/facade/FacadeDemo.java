package patterns.structural.facade;

public class FacadeDemo {
    public static void main(String[] args){
        TravelFacade travelFacade = new TravelFacade();
        BookingInfo bookingInfo =  new BookingInfo();
        bookingInfo.setDestination("Tallinn");
        bookingInfo.setSource("Tartu");
        PersonInfo personInfo =  new PersonInfo();
        personInfo.setName("Alex");
        personInfo.setAge(30);
        travelFacade.book(BookingType.Hotel,bookingInfo);
        travelFacade.book(BookingType.Train_And_Hotel,bookingInfo);
        travelFacade.book(BookingType.BUS,bookingInfo);
    }
}
