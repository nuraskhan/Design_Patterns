package Assignments.Assignment_7.ChainOfResponsibility;

import java.net.NetworkInterface;

public class NetworkSupport implements Support{
    private Support next;

    public NetworkSupport(Support next) {
        this.next = next;
    }
    @Override
    public void handleRequest(Ticket request) {
        if(request.getType().equals("network")){
            System.out.println("Issue is handled by Network Support");
        }else{
            System.out.println("No handler available for ticket #" + request.getId());
        }
    }
}
