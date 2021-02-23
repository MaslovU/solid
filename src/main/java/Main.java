import books.*;
import showcase.ShowCase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ShowCase showBooks = new ShowCase();
        FictionalBook fictionalBook = new FictionalBook("Asor", "2001", "Opa");
        fictionalBook.setQuantity(30);
        fictionalBook.deliveryFromStorage("Moscow");
        ScienceBook scienceBook = new ScienceBook("Bolt", "1994", "Jhon");
        scienceBook.deliveryFromStorage("St. Petersburg");
        DigitalBook digitalBook = new DigitalBook("Comp", "2021", "Java");

        List<IBooks> books = new ArrayList<>();
        books.add(fictionalBook);
        books.add(scienceBook);

        showBooks.showBooks(books);
        digitalBook.loadBook();

        //принцип подстановки Лисков: в коде мы можем использовать любого из потомков
        for (IBooks book: books) {
            book.moveTo();
        }

    }
}
