package books;

public class Books implements IBooks{
    private final String Author;
    private String Year;
    private String Name;
    private int quantity;

    public Books(String author, String year, String name) {
        Author = author;
        Year = year;
        Name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return Author;
    }

    public String getYear() {
        return Year;
    }

    public String getName() {
        return Name;
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
