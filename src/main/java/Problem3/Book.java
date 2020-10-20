package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;
    public Book(String title, String author) {
        this.title= title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    public Book(Book anotherBook) {
        this.title= anotherBook.title;
        this.author= anotherBook.author;
        this.id= anotherBook.id;
    }

    @Override
    public boolean equals(Object obj) {
        Book one = (Book) obj;
        boolean checker;
        if(one.id.equals(id)) {
            checker = true;
        }
        else{
            checker=false;
        }
        return checker;
    }
}
