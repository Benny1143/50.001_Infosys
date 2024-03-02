package Example52;

public class TestBusTicket {
    public static void main(String[] args) {
        Example52.BusTicket a  = new Example52.BusTicket("99",new Example52.BusFare2020());
        System.out.println(a.getTicketPrintout(100));
    }
}
