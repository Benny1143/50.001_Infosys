package Example52;

public class BusTicket {

    private String busService;
    private Example52.BusFare busFare;

    BusTicket(String busService, Example52.BusFare busFare){
        this.busService = busService;
        this.busFare = busFare;
    }

    public String getTicketPrintout(int distance){
        return "Service:"+busService + "Fare:" + busFare.getBusFare(distance);
    }
}
