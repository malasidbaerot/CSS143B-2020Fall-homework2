package Problem3;

public class BookRomance extends Book {

    private int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        super(title, author);

    }

    public BookRomance(BookRomance anotherBook) {
        super(anotherBook.author, anotherBook.title);

    }

    @Override
    public int getLateFeeInDollar()
    {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue)

    {
        return numOfDaysPastDue*getLateFeeInDollar();
    }
}
