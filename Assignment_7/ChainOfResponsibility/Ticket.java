package Assignments.Assignment_7.ChainOfResponsibility;

public class Ticket {
    private int id;
    private String description;
    private int priority;
    private String type;

    public Ticket(int id, String description, int priority, String type) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
