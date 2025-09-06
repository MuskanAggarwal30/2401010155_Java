// Assignment 4
// Q1:- Simple book and library
import java.util.ArrayList;
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title,String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getisbn() {
        return isbn;
    }
    public void displayBookInfo(){
        System.out.println("TITLE: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("ISBN: "+ isbn);
    }
}
class Library{
    private ArrayList<Book> books;
    public Library(){
        books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: "+ book.getTitle());
    }
    public void removeBook(String isbn){
        boolean found=false;
        for (Book book : books){
            if (book.getisbn().equals(isbn)){
                books.remove(book);
                System.out.println("Book Removed:- "+ book.getTitle());
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN "+ isbn + "not found.");
        }
    }
    public void displayAllBooks(){
        if (books.isEmpty()){
            System.out.println("LIBRARY IS EMPTY");
        }
        else{
            System.out.println("BOOKS IN LIBRARY:- ");
            for (Book book :books){
                book.displayBookInfo();
            }
        }
    }
}
public class main{
    public static void main(String[] args){
        Library Library=new Library();
        Book b1=new Book("Java Basics","James Gosling","111");
        Book b2=new Book("Python for beginers","Guido Vna Rossum","222");
        Book b3=new Book("C++ Programming","Bjarne Stroustrup","333");
        Library.addBook(b1);
        Library.addBook(b2);
        Library.addBook(b3);
        System.out.println("\n---Library Collection---");
        Library.displayAllBooks();
        System.out.println("\n---Removing a book---");
        Library.removeBook("222");
        System.out.println("\n---Updated Library Collection---");
        Library.displayAllBooks();
    }
}
