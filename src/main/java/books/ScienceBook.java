package books;

public class ScienceBook extends Book {
    public ScienceBook(String author, String year, String name) {
        super(author, year, name);
    }

    @Override
    public void moveTo() {
        System.out.println("Move to Science Section");
    }
}
