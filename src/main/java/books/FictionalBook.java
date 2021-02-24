package books;

public class FictionalBook extends Book {

    public FictionalBook(String author, String year, String name) {
        super(author, year, name);
    }

    @Override
    public void moveTo() {
        System.out.println("Move to fictional section");
    }
}
