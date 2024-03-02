package Example51;

public class BusTicket {

    private String busService;
    private BusFareConcrete busFare;

    BusTicket(String busService, BusFareConcrete busFare){
        this.busService = busService;
        this.busFare = busFare;
    }

    public String getTicketPrintout(int distance){
        return "Service:"+busService + "Fare:" + busFare.getBusFare(distance);
    }
}

