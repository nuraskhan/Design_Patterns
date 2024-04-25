package Assignments.Assignment_6.Facade;

import java.util.ArrayList;

public class User {
    String name;
    String login;
    String password;
    ArrayList<Book> books;

    public User(String name, String login, String password, ArrayList<Book> books) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void borrow(Book book) {
        books.add(book);
    }
}
