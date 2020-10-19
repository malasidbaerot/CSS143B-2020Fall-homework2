package Problem3;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        // homework

        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieComedy(MovieComedy anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super(anotherMovie.rating, anotherMovie.title);
    }

    @Override
    public int getLateFeeInDollar() {

        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        return numOfDaysPastDue*getLateFeeInDollar();
        // homework
    }
}
