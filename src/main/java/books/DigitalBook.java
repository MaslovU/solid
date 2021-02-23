package books;

public class DigitalBook implements IDigitalBook {
    private String Author;
    private String Year;
    private String Name;

    public DigitalBook(String author, String year, String name) {
        Author = author;
        Year = year;
        Name = name;
    }

    @Override
    public void loadBook() {
        System.out.println("Load this book to your computer");
    }
}
