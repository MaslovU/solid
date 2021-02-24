package books;

public class DigitalBook implements IDigitalBook {
    private String author;
    private String year;
    private String name;

    public DigitalBook(String author, String year, String name) {
        this.author = author;
        this.year = year;
        this.name = name;
    }

    @Override
    public void loadBook() {
        System.out.println("Load this book to your computer");
    }
}
