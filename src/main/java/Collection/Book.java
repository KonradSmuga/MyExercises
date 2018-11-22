package Collection;

public class Book {
    private String title;
    private int yearOfPublished;

    public Book(String title, int yearOfPublished) {
        this.title = title;
        this.yearOfPublished = yearOfPublished;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublished(int i) {
        return yearOfPublished;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearOfPublished=" + yearOfPublished +
                '}';
    }


}
