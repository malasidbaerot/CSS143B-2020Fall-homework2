package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.rating= rating;
        this.title=title;
    }

    public Movie(Movie anotherMovie) {
        this.rating= anotherMovie.rating;
        this.title= anotherMovie.title;
        this.id=anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        boolean checker;
        Movie ex= (Movie) obj;
        if(ex.rating.equals(rating) && ex.title.equals(title)&& ex.id.equals(id)) {
            checker = true;
        }
        else{
            checker=false;
        }
        return checker;
    }
}
