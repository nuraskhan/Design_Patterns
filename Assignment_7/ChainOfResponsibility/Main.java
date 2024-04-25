package Assignments.Assignment_7.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Support hardwareHandler = new HardwareSupport(null);
        Support softwareHandler = new SoftwareSupport(hardwareHandler);
        Support networkHandler = new NetworkSupport(softwareHandler);

        Ticket ticket1 = new Ticket(1,"", 2,"hardware");
        Ticket ticket2 = new Ticket(2, "", 2,"software");
        Ticket ticket3 = new Ticket(3, "", 2,"network");
        Ticket ticket4 = new Ticket(4, "", 2,"unknown");

        networkHandler.handleRequest(ticket1);
        networkHandler.handleRequest(ticket2);
        networkHandler.handleRequest(ticket3);
        networkHandler.handleRequest(ticket4);
    }
}
