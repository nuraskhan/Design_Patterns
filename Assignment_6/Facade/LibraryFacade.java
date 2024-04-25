package Assignments.Assignment_6.Facade;

public class LibraryFacade {
    public boolean borrowBook(Book book, User user) {
        if(SearchForAvailability.getInstance().isAvailabile(book.getId())){
            user.borrow(book);
            return true;
        }
        return false;
    }
    public boolean returnBook(Book book, User user) {
        if(user.getBooks().contains(book)){
            user.getBooks().remove(book);
            return true;
        }
        return false;
    }
}
