package Assignments.Assignment_6.Facade;

public class SearchForAvailability {
    // idea of creating singleton !!!!!!!!!!! SUIIIIIIIIIIIII !!!!!!!!!! (тип агай посмотрите какой я гений)
    private static SearchForAvailability instance;

    private SearchForAvailability() {
        // Private constructor to prevent instantiation
        // connect to DB
    }

    public static SearchForAvailability getInstance() {
        if (instance == null) {
            synchronized (SearchForAvailability.class) {
                if (instance == null) {
                    instance = new SearchForAvailability();
                }
            }
        }
        return instance;
    }

    // check DB,
    public boolean isAvailabile(long id) {
        // check from db by book id
        return true;
    }
}
