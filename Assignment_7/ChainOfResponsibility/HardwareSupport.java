package Assignments.Assignment_7.ChainOfResponsibility;

public class HardwareSupport implements Support{
    private Support next;

    public HardwareSupport(Support next) {
        this.next = next;
    }
    @Override
    public void handleRequest(Ticket request) {
        if(request.getType().equals("hardware")){
            System.out.println("Issue is handled by Hardware Support");
        }else{
            System.out.println("No handler available for ticket #" + request.getId());
        }
    }
}
