package books;

public interface IBooks {

    // принцип открытости-закрытости, при появлении нового вида книг
    // мы имплементируем интерфейс и реализуем метод в том классе не трогая другой код
    void moveTo();

    void deliveryFromStorage(String fromStorage);
}
