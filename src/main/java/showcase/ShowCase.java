package showcase;

import books.IBooks;

import java.util.List;

// принцип единой ответственности: витрина отвечает за показ книг и цен, и не отвечает за создание заказа
public class ShowCase implements IShowCase {

    @Override
    public void showBooks(List<IBooks> books) {
        for (IBooks el: books) {
            System.out.println(el);
        }
    }
}
