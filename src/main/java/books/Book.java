package books;

public class Book implements IBook {
    private final String author;
    private final String year;
    private final String name;
    private int quantity;

    public Book(String author, String year, String name) {
        this.author = author;
        this.year = year;
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public void moveTo() {
        System.out.println("Move to shop");
    }

    @Override
    public void deliveryFromStorage(String fromStorage) {
        System.out.println("Need delivery from " + fromStorage);
    }

    @Override
    public String toString() {
        return getAuthor() + " "
                + getYear() + " "
                + getName();
    }
}
