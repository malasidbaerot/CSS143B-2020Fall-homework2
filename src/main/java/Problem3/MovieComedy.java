package Problem3;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        super(rating, title);
    }

    public MovieComedy(MovieComedy anotherMovie) {
        super(anotherMovie.rating, anotherMovie.title);
    }

    @Override
    public int getLateFeeInDollar() {

        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        if(numOfDaysPastDue>0){
            return (numOfDaysPastDue)*lateFeePerDayInDollar;
        }
        else{
            return 0;
        }
    }
}
