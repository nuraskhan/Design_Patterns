package Assignments.Assignment_7.ChainOfResponsibility;

public class SoftwareSupport implements Support{
    private Support next;

    public SoftwareSupport(Support next) {
        this.next = next;
    }
    @Override
    public void handleRequest(Ticket request) {
        if(request.getType().equals("software")){
            System.out.println("Issue is handled by Software Support");
        }else{
            System.out.println("No handler available for ticket #" + request.getId());
        }
    }
}
