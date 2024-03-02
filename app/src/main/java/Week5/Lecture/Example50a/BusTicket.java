package Example50a;


public class BusTicket {

    private String busService;
    private final int SHORTFARE = 100;
    private final int LONGFARE = 120;

    BusTicket(String busService){
        this.busService = busService;
    }

    public int getBusFare(int distance){
        return  distance < 32? SHORTFARE : LONGFARE;
    }

    public String getTicketPrintout(int distance){
        return "Service:"+busService + "Fare:" + getBusFare(distance);
    }
}
